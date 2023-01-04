package com.wd.paas.generator.web.infrastructure.codegen.repository;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.UUID;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.service.FileStorageService;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.DomainChartDTO;
import com.wd.paas.generator.input.chartxml.ChartXmlStream2DomainChartDTO;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.infrastructure.codegen.assembler.DomainChartDoConvert;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.DomainChartMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import com.wd.paas.generator.web.infrastructure.codegen.repository.util.SingleVelocityFileGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.VelocityContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 领域图谱存储接口实现类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Slf4j
@Component
public class DomainChartRepositoryImpl implements DomainChartRepository {

    public static final String CHART_XML_COMPONENT_XML = "chartXmlComponent.xml";
    public static final String CHART_XML_INIT_DRAWIO_VM = "chartXmlInit.drawio.vm";

    @Resource
    private DomainChartMapper mapper;
    @Resource
    private FileStorageService fileStorageService;

    @Override
    public Long insertDomainChart(DomainChart domainChart) {
        DomainChartDO aggregationDO = DomainChartDoConvert.INSTANCE.dto2Do(domainChart);
        aggregationDO.setFileKey(this.initChartXml(domainChart));
        mapper.insert(aggregationDO);
        return aggregationDO.getId();
    }

    /**
     * 初始化图谱云文件
     *
     * @return 文件key
     */
    private String initChartXml(DomainChart domainChart) {
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("DOMAIN_NAME", domainChart.getDomainName());
        velocityContext.put("DOMAIN_DESC", excludeStr(domainChart));
        InputStream inputStream = SingleVelocityFileGenerator.run(velocityContext, CHART_XML_INIT_DRAWIO_VM);

        String key = UUID.randomUUID().toString();
        this.uploadOSSFile(key, inputStream);
        return key;
    }

    private static String excludeStr(DomainChart domainChart) {
        String domainDesc = domainChart.getDomainDesc();
        int indexOf = domainDesc.lastIndexOf("域");
        return indexOf > 0
                ? StringUtils.substring(domainDesc, 0, indexOf)
                : domainDesc;
    }

    @Override
    public void updateDomainChart(DomainChart aggregation) {
        mapper.updateById(DomainChartDoConvert.INSTANCE.dto2Do(aggregation));
    }

    @Override
    public void updateChartXml(DomainChart aggregation) {
        DomainChartDO domainChartDO = mapper.selectById(aggregation.getId());
        String fileKey = domainChartDO.getFileKey();
        uploadOSSFile(fileKey, new ByteArrayInputStream(aggregation.getChartXml().getBytes()));
    }

    @Override
    public void deleteDomainChartById(Long id) {
        DomainChartDO domainChartDO = mapper.selectById(id);
        this.deleteOSSFile(domainChartDO.getFileKey());
        mapper.deleteById(id);
    }

    @Override
    public void deleteDomainChartByProjectId(Long projectId) {
        List<DomainChartDO> domainChartDOS = mapper.selectList(
                new LambdaQueryWrapper<DomainChartDO>()
                        .eq(DomainChartDO::getProjectId, projectId));

        domainChartDOS.stream()
                .map(DomainChartDO::getFileKey)
                .forEach(this::deleteOSSFile);

        mapper.delete(new LambdaQueryWrapper<DomainChartDO>()
                .eq(DomainChartDO::getProjectId, projectId));
    }

    @Override
    public DomainChart selectDomainChartById(Long id) {
        DomainChartDO domainChartDO = mapper.selectById(id);
        DomainChart domainChart = DomainChartDoConvert.INSTANCE.do2Dto(domainChartDO);

        String fileKey = domainChartDO.getFileKey();
        domainChart.setChartXml(fileKey);
        InputStream ossFileStream = this.getOSSFileStream(fileKey);
        if (ossFileStream == null) {
            return domainChart;
        }
        try {
            String chartXml = IOUtils.toString(ossFileStream, Charset.defaultCharset());
            domainChart.setChartXml(chartXml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return domainChart;
    }

    @Override
    public List<DomainChartDTO> buildDomainChartDTOList(Long projectId) {
        List<DomainChartDO> domainChartDOS = mapper.selectList(
                new LambdaQueryWrapper<DomainChartDO>()
                        .eq(DomainChartDO::getProjectId, projectId));
        List<DomainChartDTO> domainChartDTOS = new ArrayList<>();
        domainChartDOS.forEach(domainChartDO -> {
            DomainChartDTO domainChartDTO = new DomainChartDTO();
            domainChartDTO.setName(domainChartDO.getDomainName());
            domainChartDTO.setDescription(domainChartDO.getDomainDesc());
            domainChartDTO.setAuthor(domainChartDO.getDomainAuthor());
            domainChartDTO.setDateTime(new DateTime().toStringDefaultTimeZone());
            ChartDTO chartDTO = ChartXmlStream2DomainChartDTO.getDomainChartDTO(
                    this.getOSSFileStream(domainChartDO.getFileKey()));
            domainChartDTO.setChartDTO(chartDTO);
            domainChartDTOS.add(domainChartDTO);
        });
        return domainChartDTOS;
    }

    @Override
    public InputStream downloadChartXmlByDomainChartId(Long domainChartId) {
        DomainChartDO domainChartDO = mapper.selectById(domainChartId);
        String fileKey = domainChartDO.getFileKey();
        return getOSSFileStream(fileKey);
    }

    @Override
    public InputStream downloadChartXmlComponent() {
        // 尝试从云端获取画图组件文件
        InputStream componentXml = getOSSFileStream(CHART_XML_COMPONENT_XML);
        return componentXml == null ? getFileFromLocal(CHART_XML_COMPONENT_XML) : componentXml;
    }


    /**
     * 上传云文件
     *
     * @param key       文件key
     * @param fileInput 需要上传的文件流
     */
    private void uploadOSSFile(String key, InputStream fileInput) {
        try {
            UploadRequest request = UploadRequest.builder().fileKey(key).bucket(BucketEnum.MATERIAL)
                    .build();
            fileStorageService.upload(request, fileInput);
        } catch (Exception e) {
            log.error("上传领域图谱云文件失败!");
        }
    }

    /**
     * 删除云文件
     *
     * @param key 文件key
     */
    private void deleteOSSFile(String key) {
        try {
            fileStorageService.deleteFile(BucketEnum.MATERIAL, key);
        } catch (Exception e) {
            log.error("删除领域图谱云文件失败!");
        }
    }

    /**
     * 获取云文件
     *
     * @param fileKey 文件key
     * @return 云文件流
     */
    public InputStream getOSSFileStream(String fileKey) {
        InputStream fileStream = null;
        try {
            fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL, fileKey);
        } catch (Exception e) {
            log.error("获取领域图谱云文件失败,fileKey: " + fileKey);
        }
        return fileStream;
    }

    /**
     * 获取本地文件
     *
     * @param fileKey 文件key
     * @return 文件流
     */
    private InputStream getFileFromLocal(String fileKey) {
        try (InputStream fileInput = this.getClass().getClassLoader()
                .getResourceAsStream(fileKey)) {
            if (fileInput == null) {
                throw new BizException("文件不存在!");
            }
            this.uploadOSSFile(fileKey, fileInput);
            return fileInput;
        } catch (IOException e) {
            throw new BizException("图片初始化文件资源读取失败!");
        }
    }
}

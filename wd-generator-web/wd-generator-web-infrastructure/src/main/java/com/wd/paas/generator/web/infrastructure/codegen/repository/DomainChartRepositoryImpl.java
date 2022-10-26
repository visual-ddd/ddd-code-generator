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
import com.wd.paas.generator.input.chartXml.ChartXmlStream2DomainChartDTO;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.infrastructure.codegen.assembler.DomainChartDoConvert;
import com.wd.paas.generator.web.infrastructure.codegen.repository.mapper.DomainChartMapper;
import com.wd.paas.generator.web.infrastructure.codegen.repository.model.DomainChartDO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

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

    @Resource
    private DomainChartMapper mapper;
    @Resource
    private FileStorageService fileStorageService;

    @Override
    public Long insertDomainChart(DomainChart aggregation) {
        DomainChartDO aggregationDO = DomainChartDoConvert.INSTANCE.dto2Do(aggregation);
        aggregationDO.setFileKey(this.initChartXml());
        mapper.insert(aggregationDO);
        return aggregationDO.getId();
    }

    /**
     * 初始化图谱云文件
     *
     * @return 文件key
     */
    private String initChartXml() {
        String key = UUID.randomUUID().toString();

        try (InputStream fileInput = this.getClass().getClassLoader()
            .getResourceAsStream("chartXmlInit.drawio")) {
            if (fileInput == null) {
                throw new BizException("图片初始化文件不存在!");
            }

            this.uploadOSSFile(key, fileInput);
        } catch (IOException e) {
            throw new BizException("图片初始化文件资源读取失败!");
        }
        return key;
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
        InputStream ossFileStream = this.getOSSFileStream(fileKey);
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
        return getOSSFileStream("chartXmlComponent.xml");
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
            throw new BizException("上传领域图谱云文件失败!");
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
            throw new BizException("删除领域图谱云文件失败!");
        }
    }

    /**
     * 获取云文件
     *
     * @param fileKey 文件key
     * @return 云文件流
     */
    public InputStream getOSSFileStream(String fileKey) {
        InputStream fileStream;
        try {
            fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL, fileKey);
        } catch (Exception e) {
            throw new BizException("获取领域图谱云文件失败,fileKey: " + fileKey);
        }
        return fileStream;
    }
}

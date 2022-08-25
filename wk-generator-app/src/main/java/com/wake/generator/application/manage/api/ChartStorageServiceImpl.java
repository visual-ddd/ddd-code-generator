package com.wake.generator.application.manage.api;

import com.wake.generator.application.generate.common.ChartStatusEnum;
import com.wake.generator.application.generate.config.FileKeyConfig;
import com.wake.generator.client.manage.api.ChartStorageService;
import com.wake.generator.client.manage.dto.ChartStorageDto;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.service.FileStorageService;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 图谱存储服务实现类
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/10
 */
@Slf4j
@Service
public class ChartStorageServiceImpl implements ChartStorageService {

    @Resource
    private FileStorageService fileStorageService;

    @Resource
    private DomainMapper domainMapper;

    @Resource
    private ChartMapper chartMapper;

    private static void putFileStream(HttpServletResponse response, InputStream fileStream) {
        try (BufferedInputStream bis = new BufferedInputStream(fileStream)) {
            byte[] buff = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (IOException e) {
            log.error("文件流传输异常! ", e);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultDTO<Boolean> uploadChart(ChartStorageDto chartStorageDto) {
        parameterValid(chartStorageDto);

        String newChartXml = chartStorageDto.getXml();
        DomainDO domainDO = domainMapper.selectById(chartStorageDto.getDomainId());
        Long chartId = domainDO.getChartId();
        String newChartKey = getChartKey(domainDO, chartId);
        // 上传文件
        uploadChartFile(newChartXml, newChartKey);
        return ResultDTO.success(Boolean.TRUE);
    }

    /**
     * 获取图谱文件key
     *
     * @param domainDO 领域对象
     * @param chartId  图谱id
     * @return 文件key
     */
    private String getChartKey(DomainDO domainDO, Long chartId) {
        if (Objects.equals(ChartStatusEnum.INIT.getValue(), chartId)) {
            return createNewChart(domainDO);
        } else {
            ChartDO chartDO = chartMapper.selectById(chartId);
            return chartDO.getFileKey();
        }
    }

    /**
     * 新增图谱文件
     *
     * @param domainDO 领域对象
     * @return 新文件key
     */
    private String createNewChart(DomainDO domainDO) {
        // 创建新版本
        String fileKey = UUID.randomUUID().toString();

        ChartDO newChart = new ChartDO();
        newChart.setFileKey(fileKey);
        newChart.setDomainId(domainDO.getId());
        chartMapper.insert(newChart);

        domainDO.setChartId(newChart.getId());
        domainMapper.updateById(domainDO);
        return fileKey;
    }

    @Override
    public void download(Long domainId, HttpServletResponse response) {
        DomainDO domainDO = domainMapper.selectById(domainId);
        ChartDO chartDO = chartMapper.selectById(domainDO.getChartId());
        InputStream fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL,
            chartDO.getFileKey());
        response.setContentType("application/xml");
        response.setCharacterEncoding("utf-8");
        putFileStream(response, fileStream);
    }

    @Override
    public void loadModel(HttpServletResponse response) {
        InputStream fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL,
            FileKeyConfig.DDD_TOOL_FILE_KEY);
        response.setContentType("application/xml");
        response.setCharacterEncoding("utf-8");
        putFileStream(response, fileStream);
    }

    private void parameterValid(ChartStorageDto chartStorageDto) {
        if (chartStorageDto.getDomainId() == null) {
            throw new BizException("domainId不能为空!");
        }
        if (StringUtils.isEmpty(chartStorageDto.getXml())) {
            throw new BizException("chatXml不能为空!");
        }
    }

    /**
     * 上传图谱文件
     *
     * @param chartXml 图谱xml
     * @param fileKey  文件key
     */
    private void uploadChartFile(String chartXml, String fileKey) {
        UploadRequest request = UploadRequest.builder()
            .fileKey(fileKey)
            .bucket(BucketEnum.MATERIAL)
            .build();
        try {
            fileStorageService.upload(request, new ByteArrayInputStream(chartXml.getBytes()));
        } catch (Exception e) {
            log.error("图谱上传失败！chartXml:{}, fileKey:{}", chartXml, fileKey);
            throw new BizException("图谱更新失败!");
        }
    }

}

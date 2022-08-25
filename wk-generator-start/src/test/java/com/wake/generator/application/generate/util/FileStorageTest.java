package com.wake.generator.application.generate.util;

import com.wake.generator.application.generate.config.FileKeyConfig;
import com.wake.generator.start.CodeGeneratorApplication;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.model.UploadResult;
import com.wakedata.common.storage.service.FileStorageService;
import java.io.File;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodeGeneratorApplication.class)
public class FileStorageTest {

    @Resource
    private FileStorageService fileStorageService;

    /**
     * DDD工具库
     */
    @Test
    public void uploadDDDTool() {
        File file1 = new File("DDD工具库.drawio");
        if (!file1.exists()) {
            log.error("文件未找到!");
            return;
        }
        UploadRequest request1 = UploadRequest.builder().fileKey(FileKeyConfig.DDD_TOOL_FILE_KEY)
            .bucket(BucketEnum.MATERIAL).build();
        UploadResult initTool = fileStorageService.upload(request1, file1);
        log.info(initTool.toString());
    }

    /**
     * 上传chart初始化模版
     */
    @Test
    public void uploadInitTemplate() {
        File file2 = new File("chart初始化模版.xml");
        if (!file2.exists()) {
            log.error("文件未找到!");
            return;
        }
        UploadRequest request2 = UploadRequest.builder().fileKey(FileKeyConfig.INIT_CHART_FILE_KEY)
            .bucket(BucketEnum.MATERIAL).build();
        UploadResult initChart = fileStorageService.upload(request2, file2);
        log.info(initChart.toString());
    }

}
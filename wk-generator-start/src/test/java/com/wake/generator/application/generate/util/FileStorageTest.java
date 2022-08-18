package com.wake.generator.application.generate.util;

import com.wake.generator.application.manage.config.FileKeyConfig;
import com.wake.generator.start.CodeGeneratorApplication;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.model.UploadResult;
import com.wakedata.common.storage.service.FileStorageService;
import java.io.File;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodeGeneratorApplication.class)
public class FileStorageTest {

    @Resource
    private FileStorageService fileStorageService;

    @Test
    public void upload() {
        File file1 = new File("DDD工具库.drawio");
        UploadRequest request1 = UploadRequest.builder().fileKey(FileKeyConfig.DDD_TOOL_FILE_KEY)
            .bucket(BucketEnum.MATERIAL).build();
        UploadResult initTool = fileStorageService.upload(request1, file1);
        System.out.println(initTool.toString());

        File file2 = new File("/wake-code-generator/chart初始化模版.xml");
        UploadRequest request2 = UploadRequest.builder().fileKey(FileKeyConfig.INIT_CHART_FILE_KEY)
            .bucket(BucketEnum.MATERIAL).build();
        UploadResult initChart = fileStorageService.upload(request2, file2);
        System.out.println(initChart.toString());
    }

}
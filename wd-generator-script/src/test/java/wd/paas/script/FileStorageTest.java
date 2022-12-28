package wd.paas.script;

import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.model.UploadResult;
import com.wakedata.common.storage.service.FileStorageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class FileStorageTest {

    @Resource
    FileStorageService fileStorageService;

    @Test
    public void testSave() throws IOException {
        UploadResult url = fileStorageService.getURL(BucketEnum.MATERIAL, "wd-generator-script-latest.jar");
        System.out.println(url);
        // writeToLocal("chartXmlComponent.xml", fileStream);
    }

    @Test
    public void testUpload() {
        UploadRequest request = UploadRequest.builder().fileKey("wd-generator-script-latest.jar")
            .bucket(BucketEnum.MATERIAL)
            .build();
        try (InputStream fileInput = Files.newInputStream(Paths.get("target/wd-generator-script.jar"))) {

            fileStorageService.upload(request, fileInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

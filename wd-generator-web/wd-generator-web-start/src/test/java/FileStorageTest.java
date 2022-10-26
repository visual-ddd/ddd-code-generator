import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.model.UploadRequest;
import com.wakedata.common.storage.service.FileStorageService;
import com.wd.paas.generator.web.start.StartApplication;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class FileStorageTest {

    @Resource
    FileStorageService fileStorageService;

    @Test
    public void testSave() throws IOException {
        InputStream fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL,
            "chartXmlComponent.xml");
        // writeToLocal("chartXmlComponent.xml", fileStream);
    }

    @Test
    public void testUpload() {
        UploadRequest request = UploadRequest.builder().fileKey("chartXmlComponent.xml")
            .bucket(BucketEnum.MATERIAL)
            .build();
        try (InputStream fileInput = this.getClass().getClassLoader()
            .getResourceAsStream("chartXmlComponent.xml")) {

            fileStorageService.upload(request, fileInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 文件下载
     *
     * @param destination 下载路径
     * @param input
     * @throws IOException
     */
    public static void writeToLocal(String destination, InputStream input)
        throws IOException {
        int index;
        byte[] bytes = new byte[1024];
        FileOutputStream downloadFile = new FileOutputStream(destination);
        while ((index = input.read(bytes)) != -1) {
            downloadFile.write(bytes, 0, index);
            downloadFile.flush();
        }
        input.close();
        downloadFile.close();

    }

}

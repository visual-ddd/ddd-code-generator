import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class KeyWordTest {

    @Test
    public void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/shimmer/Project/Idea/Company/wake/wake-code-generator/wd-generator-web/代码生成器-管理领域.drawio");
        String s = IOUtils.toString(fileInputStream, Charset.defaultCharset());
//        System.out.println(s);

        String pattern = "Desc=\"([^\"]*)\"";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(s);

        while (m.find( )) {
            System.out.println("Found value: " + m.group(1) );
        }

        Result parse = ToAnalysis.parse(s);
//        System.out.println(parse);
    }

}

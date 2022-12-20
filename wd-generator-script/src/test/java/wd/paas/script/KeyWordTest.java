package wd.paas.script;

import com.huaban.analysis.jieba.WordDictionary;
import com.qianxinyao.analysis.jieba.keyword.Keyword;
import com.qianxinyao.analysis.jieba.keyword.TFIDFAnalyzer;
import com.wd.paas.baidu.translate.demo.TransApi;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class KeyWordTest {

    private static final String APP_ID = "20211215001029035";
    private static final String SECURITY_KEY = "zjR6WMvbBbBbE4VyhzIP";

    public static void main(String[] args) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String query = "带看单";
        System.out.println(api.getTransResult(query, "zh", "en"));
    }

    @Test
    public void test() throws IOException {
//        String drawioContent = getDrawioContent();

        String path="/Users/shimmer/Downloads/【1018165】渠道带看单方案20220816_ V5.0.docx";
        StringBuilder wordStringBuilder = new StringBuilder();
        WordReadTest.spireParaghDoc(path, wordStringBuilder);
        String content = validate(wordStringBuilder.toString());

        translation(getKeyWord(content));
    }

    private static void translation(List<String> result) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String resultStr = result.toString();
        String transResultStr = api.getTransResult(resultStr, "zh", "en");
        String dst = "\"dst\":\"\\[([^\"]*)\\]\"";
        Pattern dstPattern = Pattern.compile(dst);
        Matcher transMatcher = dstPattern.matcher(transResultStr);

        if (transMatcher.find()) {
            String trans = transMatcher.group(1);
            List<String> collect = Arrays.stream(trans.split(",")).collect(Collectors.toList());
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < result.size(); i++) {
                strings.add(result.get(i) + " " + collect.get(i));
            }

            strings.forEach(System.out::println);
        } else {
            System.out.println("未匹配到翻译结果");
            result.forEach(System.out::println);
        }
    }

    private static List<String> getKeyWord(String content) {
        ArrayList<String> result = new ArrayList<>();

        WordDictionary.getInstance().loadUserDict(Paths.get(
            "/Users/shimmer/Project/Idea/Company/wake/wake-code-generator/wd-generator-script/dc.txt"));

        int topN = 1000;
        TFIDFAnalyzer tfidfAnalyzer = new TFIDFAnalyzer();
        List<Keyword> list = tfidfAnalyzer.analyze(content, topN);

        for (Keyword word : list) {
            result.add(word.getName());
        }
        return result;
    }

    private static String getDrawioContent() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./渠道带看单领域.drawio");
        String s = IOUtils.toString(fileInputStream, Charset.defaultCharset());

        String pattern = "Desc=\"([^\"]*)\"";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);

        StringBuilder stringBuilder = new StringBuilder();
        while (m.find()) {
            stringBuilder.append(m.group(1)).append(",");
        }

        return stringBuilder.toString();
    }

    private static String validate(String content) {
        //去除空格和特殊字符
        String regEx = "[\n\r\t`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？^p_]";
        content = content.replaceAll(regEx, StringUtils.EMPTY).replaceAll("　", StringUtils.EMPTY)
            .replaceAll(StringUtils.SPACE, StringUtils.EMPTY)
            .replaceAll("[a-zA-Z]", StringUtils.EMPTY).replaceAll("[0-9]", StringUtils.EMPTY);
        return content;
    }

}

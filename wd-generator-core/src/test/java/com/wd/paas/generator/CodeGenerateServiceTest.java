package com.wd.paas.generator;

import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@DisplayName("代码生成服务-静态测试")
public class CodeGenerateServiceTest {

    public static final String RESULT_VERIFY_PATH = "src/test/resources/resultVerify/";
    public static final String APPLICATION_DSL_JSON = "src/test/resources/testCase/applicationDsl.json";
    public static final String BUSINESS_DOMAIN_DSL_JSON = "src/test/resources/testCase/businessDomainDsl.json";
    public static final String BUSINESS_SCENARIOS_DSL_JSON = "src/test/resources/testCase/businessScenariosDsl.json";

    @BeforeAll
    public static void beforeAll() throws Exception {
        System.out.println("清理旧数据...");
        FileUtils.deleteDirectory(new File(RESULT_VERIFY_PATH));
    }

    @Test
    @DisplayName("测试生成项目，验证项目生成结果")
    void testGenProject() {
        executeGenService(APPLICATION_DSL_JSON, RESULT_VERIFY_PATH + "testGenProject", "生成【项目模块】执行成功...");
    }

    @Test
    @DisplayName("测试生成业务域，验证业务域生成结果")
    void testGenBusinessDomain() {
        executeGenService(BUSINESS_DOMAIN_DSL_JSON, RESULT_VERIFY_PATH + "testGenBusinessDomain", "生成【业务域模块】执行成功...");
    }

    @Test
    @DisplayName("测试生成业务域，验证业务场景生成结果")
    void testGenBusinessScenarios() {
        executeGenService(BUSINESS_SCENARIOS_DSL_JSON, RESULT_VERIFY_PATH + "testGenBusinessScenarios", "生成【业务场景模块】执行成功...");
    }


    @SneakyThrows
    private static void executeGenService(String testJson, String outPath, String message) {
        // step 1: 读取需要生成的DSL文件
        String applicationDSLJson = FileUtils.readFileToString(new File(testJson), StandardCharsets.UTF_8);

        // step 2: 调用代码生成服务，生成代码
        CodeGenerateService codeGenerateService = new CodeGenerateService(applicationDSLJson);
        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext(outPath));
        codeGenerateService.run(templateVisitor);
        System.out.println(message);

        // step 3: 验证代码生成结果
        compareGenResult(outPath);
    }

    private static void compareGenResult(String outPath) throws IOException, InterruptedException {
        System.out.println("对比生成结果差异...");

        Runtime runtime = Runtime.getRuntime();
        Process processAdd = runtime.exec("git add .");
        processAdd.waitFor();

        Process process = runtime.exec("git diff HEAD --stat -- " + outPath);
        process.waitFor();

        String result = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
        System.out.println(result);

        // step 4: 断言生成结果相同
        Assertions.assertTrue(StringUtils.isEmpty(result), "最新生成结果与上一次提交存在差异，请确认生成结果！");
        System.out.println("生成结果无差异，验证通过！");
    }
}
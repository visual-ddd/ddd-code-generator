package com.wd.paas.script;

import com.wd.paas.generator.convert.project.ProjectGeneratorDTO;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.DomainChartGeneratorDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.generator.project.ProjectGenerator;
import com.wd.paas.generator.input.chartXml.ChartXmlStream2DomainChartDTO;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;

/**
 * 脚本main
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Slf4j
public class Main {

    /**
     * 是否调试状态
     */
    private static final boolean IS_DEBUG = true;

    public static void main(String[] args) {
        System.out.println("========== 启动代码生成器脚本🔧 ==========");
        consoleInputArguments(initConsole());

        ProjectGeneratorDTO projectGeneratorDTO = getProjectGeneratorDTO(
            getDomainChartGeneratorDTO(getChartDTO()));

        ProjectGenerator projectGenerator = projectGeneratorDTO.trans2ProjectGenerator();
        GenerateContext generateContext = new GenerateContext(new VelocityContext(),
            UserArgument.outputPath, null);

        projectGenerator.generate(generateContext);
        System.out.println("========== 生成脚本执行成功!✅ ==========");
    }

    /**
     * 获取项目生成器dto
     *
     * @param chartGeneratorDTO 领域图谱生成器dto
     * @return 项目生成器dto
     */
    private static ProjectGeneratorDTO getProjectGeneratorDTO(
        DomainChartGeneratorDTO chartGeneratorDTO) {
        ProjectGeneratorDTO projectGeneratorDTO = new ProjectGeneratorDTO();
        projectGeneratorDTO.setName(UserArgument.projectName);
        projectGeneratorDTO.setAuthor(UserArgument.projectAuthor);
        projectGeneratorDTO.setDateTime(UserArgument.projectDateTime);
        projectGeneratorDTO.setGroup(UserArgument.group);
        projectGeneratorDTO.setDomainChartList(Collections.singletonList(chartGeneratorDTO));
        return projectGeneratorDTO;
    }

    /**
     * 获取领域图谱生成器dto
     *
     * @param chartDTO 图谱dto
     * @return 领域图谱生成器dto
     */
    private static DomainChartGeneratorDTO getDomainChartGeneratorDTO(
        ChartDTO chartDTO) {
        DomainChartGeneratorDTO chartGeneratorDTO = new DomainChartGeneratorDTO();
        chartGeneratorDTO.setName(UserArgument.domainName);
        chartGeneratorDTO.setDescription(UserArgument.description);
        chartGeneratorDTO.setAuthor(UserArgument.domainAuthor);
        chartGeneratorDTO.setDateTime(UserArgument.domainDateTime);
        chartGeneratorDTO.setChartDTO(chartDTO);
        return chartGeneratorDTO;
    }

    /**
     * 获取图谱dto
     *
     * @return 图谱dto
     */
    private static ChartDTO getChartDTO() {
        ChartDTO domainChartDTO = null;
        try (InputStream chartXmlStream = Files.newInputStream(
            Paths.get(UserArgument.chartXmlPath))) {

            domainChartDTO = ChartXmlStream2DomainChartDTO.getDomainChartDTO(chartXmlStream);
        } catch (IOException e) {
            if (IS_DEBUG) {
                e.printStackTrace();
            }
            log.error("io流异常");
            System.out.println("系统异常: 详细信息请查看日志");
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        }
        return domainChartDTO;
    }

    /**
     * 初始化控制台
     *
     * @return 控制台
     */
    private static Console initConsole() {
        Console console = System.console();
        if (console == null && !IS_DEBUG) {
            System.out.println("请使用命令行启动脚本!");
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        }
        return console;
    }

    /**
     * 用户输入
     *
     * @param console 控制台
     */
    private static void consoleInputArguments(Console console) {
        if (IS_DEBUG) {
            return;
        }
        UserArgument.chartXmlPath = InputChecker.validInputPath(console.readLine("图谱路径> "));
        UserArgument.projectName = console.readLine("项目名> ");
        UserArgument.group = console.readLine("包路径> ");
        UserArgument.domainName = console.readLine("领域名称> ");
        UserArgument.domainAuthor = console.readLine("领域作者> ");
        UserArgument.outputPath = console.readLine("输出路径> ");
    }

}

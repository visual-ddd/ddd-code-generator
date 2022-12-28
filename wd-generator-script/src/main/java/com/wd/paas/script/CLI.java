package com.wd.paas.script;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.CodeGenerateServiceImpl;
import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.DomainChartDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateWayEnum;
import com.wd.paas.generator.input.chartXml.ChartXmlStream2DomainChartDTO;
import org.apache.velocity.VelocityContext;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

/**
 * 输入参数
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
//@Parameters(separators = "=")
public class CLI {

    @Parameter(names = {"-h", "--help"}, help = true, order = 5)
    public boolean help;

    @Parameter(names = {"-v",
        "--version"}, description = "code-generate tool version", help = true, order = 6)
    public boolean version;

    /**
     * 领域图谱
     */
    @Parameter(names = {"-i", "--chartXmlPath"}, description = "领域图谱路径", required = true)
    public String chartXmlPath = "./wd-generator-script/代码生成器-管理领域.drawio";
    @Parameter(names = {"-o", "--outputPath"}, description = "输出路径")
    public String outputPath = "./";
    /**
     * 项目信息
     */
    @Parameter(names = {"-pn", "--projectName"}, description = "所属项目名称", required = true)
    public String projectName = "wd-generator-web";
    @Parameter(names = {"-pa", "--projectAuthor"}, description = "项目作者")
    public String projectAuthor = "ZhuXueLiang";
    @Parameter(names = {"-pd", "--projectDateTime"}, description = "项目创建时间")
    public String projectDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(
        new Date());
    @Parameter(names = {"-pg", "--projectGroup"}, description = "项目包名", required = true)
    public String group = "com.wd.paas.generator.web";
    /**
     * 领域信息
     */
    @Parameter(names = {"-dn", "--domainName"}, description = "领域名称", required = true)
    public String domainName = "codegen";
    @Parameter(names = {"-dc", "--domainDesc"}, description = "领域描述")
    public String description = "代码生成领域";
    @Parameter(names = {"-da", "--domainAuthor"}, description = "领域作者")
    public String domainAuthor = "GaoZhiYi, ZhuXueLiang";
    @Parameter(names = {"-dd", "--domainDateTime"}, description = "领域创建时间")
    public String domainDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(
        new Date());

    @Parameter(names = {"-w", "--generateWay"}, description = "生成方式: 全量, 增量")
    public GenerateWayEnum generateWay = GenerateWayEnum.OVERALL;


    /**
     * 运行
     *
     * @param jCommander 命令行参数
     */
    protected void run(JCommander jCommander) {
        // 帮助文档
        if (help) {
            jCommander.usage();
            return;
        }
        // 版本号
        if (version) {
            jCommander.getConsole().println("codeGenerator version 1.2.0 (WakeData Paas)");
            return;
        }

        jCommander.getConsole().println("========== 启动代码生成器脚本 ==========");

        ProjectDTO projectGeneratorDTO = getProjectGeneratorDTO(
            getDomainChartGeneratorDTO(getChartDTO()));
        GenerateContext generateContext = new GenerateContext(new VelocityContext(),
            outputPath, null, generateWay);

        generateContext.setIsGenerateProjectFrame(false);

        CodeGenerateService codeGenerateService = new CodeGenerateServiceImpl();
        codeGenerateService.generate(projectGeneratorDTO, generateContext);
        jCommander.getConsole().println("========== 生成脚本执行成功! ==========");
    }

    /**
     * 获取项目生成器dto
     *
     * @param chartGeneratorDTO 领域图谱生成器dto
     * @return 项目生成器dto
     */
    private ProjectDTO getProjectGeneratorDTO(
        DomainChartDTO chartGeneratorDTO) {
        ProjectDTO projectGeneratorDTO = new ProjectDTO();
        projectGeneratorDTO.setName(projectName);
        projectGeneratorDTO.setAuthor(projectAuthor);
        projectGeneratorDTO.setDateTime(projectDateTime);
        projectGeneratorDTO.setGroup(group);
        projectGeneratorDTO.setDomainChartList(Collections.singletonList(chartGeneratorDTO));
        return projectGeneratorDTO;
    }

    /**
     * 获取领域图谱生成器dto
     *
     * @param chartDTO 图谱dto
     * @return 领域图谱生成器dto
     */
    private DomainChartDTO getDomainChartGeneratorDTO(
        ChartDTO chartDTO) {
        DomainChartDTO chartGeneratorDTO = new DomainChartDTO();
        chartGeneratorDTO.setName(domainName);
        chartGeneratorDTO.setDescription(description);
        chartGeneratorDTO.setAuthor(domainAuthor);
        chartGeneratorDTO.setDateTime(domainDateTime);
        chartGeneratorDTO.setChartDTO(chartDTO);
        return chartGeneratorDTO;
    }

    /**
     * 获取图谱dto
     *
     * @return 图谱dto
     */
    private ChartDTO getChartDTO() {
        ChartDTO domainChartDTO = null;
        try (InputStream chartXmlStream = Files.newInputStream(Paths.get(chartXmlPath))) {

            domainChartDTO = ChartXmlStream2DomainChartDTO.getDomainChartDTO(chartXmlStream);

        } catch (NoSuchFileException e) {
            System.out.println("未找到资源文件! chartXmlPath : " + chartXmlPath);
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        }
        return domainChartDTO;
    }
}
package com.wake.generator.application.generate.generator;

import com.wake.generator.application.generate.common.GenerateElementTypeEnum;
import com.wake.generator.application.generate.config.TemplateConfig;
import com.wake.generator.application.generate.entity.GenerateChart;
import com.wake.generator.application.generate.entity.GenerateElement;
import com.wake.generator.application.generate.entity.Global;
import com.wake.generator.application.generate.entity.ModelFile;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.ZipOutputStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * 领域图谱代码生成器
 *
 * @author ZhuXueLiang
 * @date 2022/3/11 11:05
 * @since 1.0
 */
@Slf4j
public class DomainChartCodeGenerator implements GeneratedCode {

    /**
     * 领域图谱模型
     */
    private final List<GenerateChart> generateChartList;

    public DomainChartCodeGenerator(List<GenerateChart> generateChartList) {
        this.generateChartList = generateChartList;
    }

    /**
     * 代码生成方法 根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     */
    @Override
    public void run(ZipOutputStream zipOutputStream) {
        // 初始化标签上下文
        VelocityContext velocityContext = initTemplateContext();
        for (GenerateChart generateChart : generateChartList) {
            parserModelUrl(generateChart);
            // 填充全局配置标签
            velocityContext.put("globalLabel", generateChart.getGlobal());
            // 文件生成
            Set<GenerateElement> generateElementSet = generateChart.getGenerateElements();
            for (GenerateElement generateElement : generateElementSet) {
                generateSingleElement(velocityContext, generateElement, generateElementSet,
                    zipOutputStream);
            }
        }
    }

    /**
     * 配置velocity上下文
     */
    public VelocityContext initTemplateContext() {
        // 设置velocity资源加载器
        Properties properties = new Properties();
        // 加载classpath目录下的vm文件
        properties.setProperty("resource.loader.file.class",
            "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 定义字符集
        properties.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        Velocity.init(properties);
        return new VelocityContext();
    }

    /**
     * 生成单个元素区域对应的模板
     *
     * @param velocityContext 上下文标签map
     * @param element         单个领域元素信息
     */
    private void generateSingleElement(VelocityContext velocityContext, GenerateElement element,
        Set<GenerateElement> domainShapeList, ZipOutputStream zipOutputStream) {
        // 设置标签
        velocityContext.put("classLabel", element);
        velocityContext.put("fieldLabels", element.getFieldList());
        velocityContext.put("methodLabels", element.getMethodList());
        // 获取聚合下所有指令
        if (element.getShapeType().equals(GenerateElementTypeEnum.AGGREGATION)) {
            String color = element.getColor();
            List<GenerateElement> cmdList = domainShapeList.stream()
                .filter(domainShape ->
                    GenerateElementTypeEnum.COMMAND.equals(domainShape.getShapeType())
                        && Objects.equals(color, domainShape.getColor()))
                .collect(Collectors.toList());
            velocityContext.put("cmdList", cmdList);
        }
        // 文件结构及代码生成
        FileGenerator.run(velocityContext, element.getModelMap(), zipOutputStream);
    }

    /**
     * 解析模板文件
     */
    public void parserModelUrl(GenerateChart domainChart) {
        for (GenerateElement generateElement : domainChart.getGenerateElements()) {
            List<ModelFile> modelFiles = generateElement.getModelFiles();
            // 根据元素类型获取对应的模板集合
            String[] templateUrls = generateElement.getShapeType().getTemplateUrlSet();

            for (String templateUrl : templateUrls) {
                ModelFile modelFile = new ModelFile();
                // 类加载器加载资源
                modelFile.setTemplateUrl(TemplateConfig.TEMPLATE_PRE_URL + templateUrl);
                // 解析输出路径
                String outputPath;
                GenerateElement parentAggregation = generateElement.getParentAggregation();
                GenerateElementTypeEnum elementType = generateElement.getShapeType();
                String elementName = generateElement.getName();
                Global global = domainChart.getGlobal();
                switch (elementType) {
                    case PROJECT:
                        outputPath = parserProjectPath(global, templateUrl);
                        break;
                    case AGGREGATION:
                        outputPath = parserAggregationPath(global, elementName, templateUrl);
                        break;
                    case VALUE_OBJECT:
                        outputPath = parserValueObjectPath(global, parentAggregation.getName(),
                            elementName, templateUrl);
                        break;
                    case COMMAND:
                    case EVENT:
                        outputPath = parserActionPath(global, parentAggregation.getName(),
                            elementName, generateElement.getActionName(), templateUrl);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + elementType);
                }
                modelFile.setOutputUrl("//" + outputPath);
                modelFiles.add(modelFile);
            }
        }
    }

    /**
     * 解析聚合路径
     *
     * @param templateUrl 模板路径
     * @return 解析后的聚合路径
     */
    private String parserProjectPath(Global global, String templateUrl) {
        String projectUrl = templateUrl;
        try {
            projectUrl = projectUrl
                .replace("{projectName}", global.getProjectName())
                .replace("{group}", global.getGroup().replace(".", "/"))
                .replace(".vm", "");
        } catch (Exception e) {
            log.error("路径中的参数不能为空！");
        }
        return projectUrl;
    }

    /**
     * 解析聚合路径
     *
     * @param aggregationName 聚合名称
     * @param templateUrl     模板路径
     * @return 解析后的聚合路径
     */
    private String parserAggregationPath(Global global, String aggregationName,
        String templateUrl) {
        String lowerName = aggregationName.toLowerCase();
        return parserProjectPath(global, templateUrl)
            .replace("{field}", global.getFiled())
            .replace("{aggregation}", lowerName)
            .replace(GenerateElementTypeEnum.AGGREGATION.getName(), aggregationName);
    }

    /**
     * 解析值对象路径
     *
     * @param aggregationName 聚合名称
     * @param templateUrl     模板路径
     * @return 解析后的聚合路径
     */
    private String parserValueObjectPath(Global global, String aggregationName,
        String valueObjectName,
        String templateUrl) {
        return parserAggregationPath(global, aggregationName, templateUrl)
            .replace(GenerateElementTypeEnum.VALUE_OBJECT.getName(), valueObjectName);
    }

    /**
     * 解析action路径
     *
     * @param aggregationName 聚合名称
     * @param actionName      action包名
     * @param templateUrl     模板路径
     * @return 解析后的action路径
     */
    private String parserActionPath(Global global, String aggregationName, String className,
        String actionName,
        String templateUrl) {
        String action = Optional.ofNullable(actionName).orElse("action");
        String lowerName = action.substring(0, 1).toLowerCase() + action.substring(1);
        return parserAggregationPath(global, aggregationName, templateUrl)
            .replace("{action}", lowerName)
            .replace(GenerateElementTypeEnum.COMMAND.getName(), className)
            .replace(GenerateElementTypeEnum.EVENT.getName(), className);
    }

}


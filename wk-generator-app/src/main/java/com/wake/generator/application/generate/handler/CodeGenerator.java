package com.wake.generator.application.generate.handler;

import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.application.generate.entity.DomainShape;
import com.wake.generator.application.generate.entity.Global;
import com.wake.generator.application.generate.entity.ModelFile;
import com.wake.generator.client.generete.common.DomainShapeEnum;
import com.wake.generator.client.generete.common.TemplateConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipOutputStream;

/**
 * 实现项目代码的生成
 *
 * @author ZhuXueLiang
 * @date 2022/3/11 11:05
 * @since 1.0
 */
@Slf4j
public class CodeGenerator {

    public static CodeGenerator getInstance() {
        return new CodeGenerator();
    }

    /**
     * 代码生成方法
     * 根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     *
     * @param domainChart         领域图谱
     */
    public void codeGenerate(DomainChart domainChart, ZipOutputStream zipOutputStream) {
        // 创建模板文件并解析输出路径
        this.parserModelFiles(domainChart, "//");
        // 初始化标签上下文
        VelocityContext velocityContext = initTemplateContext();
        // 填充全局配置标签
        velocityContext.put("globalLabel", domainChart.getGlobal());
        // 文件生成
        Set<DomainShape> domainShapeList = domainChart.getDomainShapeList();
        domainShapeList.forEach(element -> generateSingleElement(velocityContext, element, zipOutputStream));
    }

    /**
     * 生成单个元素区域对应的模板
     *
     * @param velocityContext 上下文标签map
     * @param element         单个领域元素信息
     */
    private void generateSingleElement(VelocityContext velocityContext, DomainShape element,
                                       ZipOutputStream zipOutputStream) {
        // 设置标签
        velocityContext.put("classLabel", element);
        velocityContext.put("fieldLabels", element.getFieldList());
        velocityContext.put("methodLabels", element.getMethodList());
        // 文件结构及代码生成
        FileGenerator.run(velocityContext, element.getModelMap(), zipOutputStream);
    }

    /**
     * 配置velocity上下文
     */
    public VelocityContext initTemplateContext() {
        // 设置velocity资源加载器
        Properties prop = new Properties();
        // 设置模板加载位置(velocity会自动在模板路径前追加资源路径，包括模板中的引用路径！)
        prop.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, TemplateConfig.TEMPLATE_PRE_URL);
        Velocity.init(prop);

        HashMap<String, Object> templateMap = new HashMap<>(1);
        // 初始化配置
        templateMap.put("datetime", new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        return new VelocityContext(templateMap);
    }

    /**
     * 解析模板文件
     *
     * @param domainChart     项目信息
     * @param destinationPath 目标输出路径
     */
    private void parserModelFiles(DomainChart domainChart, String destinationPath) {
        for (DomainShape domainShape : domainChart.getDomainShapeList()) {
            List<ModelFile> modelFiles = domainShape.getModelFiles();
            // 根据元素类型获取对应的模板集合
            List<String> templateUrls = new ArrayList<>(
                    Arrays.asList(domainShape.getShapeType().getTemplateUrlSet()));
            for (String templateUrl : templateUrls) {
                ModelFile modelFile = new ModelFile();
                modelFile.setTemplateUrl(templateUrl);
                // 解析输出路径
                String outputPath;
                DomainShape parentAggregation = domainShape.getParentAggregation();
                DomainShapeEnum elementType = domainShape.getShapeType();
                String shapeName = domainShape.getName();
                Global global = domainChart.getGlobal();
                switch (elementType) {
                    case PROJECT:
                        outputPath = parserProjectPath(global, templateUrl);
                        break;
                    case AGGREGATION:
                        outputPath = parserAggregationPath(global, shapeName, templateUrl);
                        break;
                    case VALUE_OBJECT:
                        outputPath = parserValueObjectPath(global, parentAggregation.getName(), shapeName, templateUrl);
                        break;
                    case COMMAND:
                    case EVENT:
                        outputPath = parserActionPath(global, parentAggregation.getName(), shapeName,
                                domainShape.getActionName(), templateUrl);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + elementType);
                }
                modelFile.setOutputUrl(destinationPath + outputPath);
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
                    .replace("{field}", global.getFiled())
                    .replace(".vm", "");
        } catch (Exception e) {
            log.error("路径中的参数不能为空！");
            e.printStackTrace();
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
    private String parserAggregationPath(Global global, String aggregationName, String templateUrl) {
        String lowerName = aggregationName.toLowerCase();
        return parserProjectPath(global, templateUrl)
                .replace("{aggregation}", lowerName)
                .replace(DomainShapeEnum.AGGREGATION.getName(), aggregationName);
    }

    /**
     * 解析值对象路径
     *
     * @param aggregationName 聚合名称
     * @param templateUrl     模板路径
     * @return 解析后的聚合路径
     */
    private String parserValueObjectPath(Global global, String aggregationName, String valueObjectName,
                                         String templateUrl) {
        return parserAggregationPath(global, aggregationName, templateUrl)
                .replace(DomainShapeEnum.VALUE_OBJECT.getName(), valueObjectName);
    }

    /**
     * 解析action路径
     *
     * @param aggregationName 聚合名称
     * @param actionName      action包名
     * @param templateUrl     模板路径
     * @return 解析后的action路径
     */
    private String parserActionPath(Global global, String aggregationName, String className, String actionName,
                                    String templateUrl) {
        Objects.requireNonNull(actionName);
        String lowerName = actionName.substring(0, 1).toLowerCase() + actionName.substring(1);
        return parserAggregationPath(global, aggregationName, templateUrl)
                .replace("{action}", lowerName)
                .replace(DomainShapeEnum.COMMAND.getName(), className)
                .replace(DomainShapeEnum.EVENT.getName(), className);
    }

}


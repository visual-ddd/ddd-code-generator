package com.wake.generator.application.cola.handler;

import com.wake.generator.application.cola.entity.DomainShape;
import com.wake.generator.application.cola.entity.Global;
import com.wake.generator.application.cola.entity.ModelFile;
import com.wake.generator.application.cola.entity.ProjectChart;
import com.wake.generator.client.common.DomainShapeEnum;
import com.wake.generator.client.common.TemplateConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 实现项目代码的生成
 *
 * @author ZhuXueLiang
 * @date 2022/3/11 11:05
 * @since 1.0
 */
@Slf4j
public class CodeGenerator {

    /**
     * 返回的文件列表
     */
    List<String> fileList = new ArrayList<>();

    public static CodeGenerator getInstance() {
        return new CodeGenerator();
    }

    /**
     * 代码生成方法
     *
     * <p>根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     */
    public void codeGenerate(ProjectChart projectChart) {
        // 创建模板文件并解析输出路径
        parserModelFiles(projectChart);

        // 初始化标签上下文
        VelocityContext velocityContext = initTemplateContext(new HashMap<>(0));

        // 填充全局配置标签
        velocityContext.put("globalLabel", projectChart.getGlobal());

        Set<DomainShape> domainShapeList = projectChart.getDomainShapeList();
        domainShapeList.forEach(element -> generateSingleElement(velocityContext, element));
    }

    /**
     * 生成单个元素区域对应的模板
     *
     * @param velocityContext 上下文标签map
     * @param element         单个领域元素信息
     */
    private void generateSingleElement(VelocityContext velocityContext, DomainShape element) {
        // 设置标签
        velocityContext.put("classLabel", element);
        velocityContext.put("fieldLabels", element.getFieldList());
        velocityContext.put("methodLabels", element.getMethodList());
        // 文件结构及代码生成
        FileGenerator fileGenerator = new FileGenerator();
        List<String> files = fileGenerator.run(velocityContext, element.getModelMap());
        fileList.addAll(files);
    }

    /**
     * 配置velocity上下文
     *
     * @param templateMap 封装的模板数据
     */
    public VelocityContext initTemplateContext(Map<String, Object> templateMap) {
        // 设置velocity资源加载器
        Properties prop = new Properties();
        // 设置模板加载位置
        prop.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, TemplateConfig.TEMPLATE_PRE_URL);
        Velocity.init(prop);

        // 初始化配置
        templateMap.put("datetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return new VelocityContext(templateMap);
    }


    /**
     * 解析模板文件
     *
     * @param projectChart 项目信息
     */
    private void parserModelFiles(ProjectChart projectChart) {
        Set<DomainShape> domainShapes = projectChart.getDomainShapeList();
        for (DomainShape domainShape : domainShapes) {
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
                Global global = projectChart.getGlobal();
                switch (elementType) {
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
                modelFile.setOutputUrl(outputPath);
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
        return templateUrl
                // 项目
                .replace("{projectName}", global.getProjectName())
                // 分组
                .replace("{group}", global.getGroup().replace(".", "\\"))
                // 领域
                .replace("{field}", global.getFiled())
                .replace("vm", "");
    }

    /**
     * 解析聚合路径
     *
     * @param aggregationName 聚合名称
     * @param templateUrl     模板路径
     * @return 解析后的聚合路径
     */
    private String parserAggregationPath(Global global, String aggregationName, String templateUrl) {
        String lowerName = aggregationName.substring(0, 1).toLowerCase() + aggregationName.substring(1);
        return parserProjectPath(global, templateUrl)
                .replace("{polymerization}", lowerName)
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

    /**
     * 保存文件列表
     */
    public void storeFileNames() {
        File file = new File("fileNameList.txt");
        try (FileWriter fw = new FileWriter(file)) {
            for (String s : fileList) {
                s = "" + s.replace("..", "");
                fw.write(s + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 字符转成大写
     *
     * @param c 需要转化的字符
     */
    public static char toUpperCase(char c) {
        if (97 <= c && c <= 122) {
            c ^= 32;
        }
        return c;
    }
}


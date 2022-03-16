package com.wake.generator.application.handler;

import com.wake.generator.application.constant.DomainElementType;
import com.wake.generator.application.constant.TemplateConstant;
import com.wake.generator.application.entity.DomainElement;
import com.wake.generator.application.entity.Global;
import com.wake.generator.application.entity.ModelFile;
import com.wake.generator.application.entity.ProjectChart;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

/**
 * <p>Title: CodeGenerator</p>
 * <p>Description: 通过Velocity模板引擎生成指定框架代码</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:05
 */
@Slf4j
public class CodeGenerator {

    /**
     * 文件列表
     */
    List<String> fileList = new ArrayList<>();

    /**
     * 代码生成器
     * <p>
     * 根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     * </p>
     */
    public void codeGenerate(ProjectChart project) {
        // 创建模板文件并解析输出路径
        this.parserModelFiles(project);

        // 初始化标签上下文
        VelocityContext velocityContext = initTemplateContext(new HashMap<>(0));

        // 填充全局配置标签
        velocityContext.put("globalLabel", project.getGlobal());

        List<DomainElement> domainElementList = project.getDomainElementList();
        for (DomainElement element : domainElementList) {
            // 设置标签
            velocityContext.put("classLabel", element);
            velocityContext.put("fieldLabels", element.getFieldList());
            velocityContext.put("methodLabels", element.getMethodList());
            // 文件结构及代码生成
            FileGenerator fileGenerator = new FileGenerator();
            List<String> files = fileGenerator.run(velocityContext, element.getModelMap());
            fileList.addAll(files);
        }
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
        prop.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, TemplateConstant.TEMPLATE_PRE_URL);
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
        List<DomainElement> domainElements = projectChart.getDomainElementList();
        for (DomainElement domainElement : domainElements) {
            List<ModelFile> modelFiles = domainElement.getModelFiles();
            // 根据元素类型获取对应的模板集合
            List<String> templateUrls = new ArrayList<>(
                Arrays.asList(domainElement.getElementType().getTemplateUrlSet()));
            for (String templateUrl : templateUrls) {
                ModelFile modelFile = new ModelFile();
                modelFile.setTemplateUrl(templateUrl);
                // 解析输出路径
                String outputPath;
                DomainElement parentAggregation = domainElement.getParentAggregation();
                DomainElementType elementType = domainElement.getElementType();
                switch (elementType) {
                    case AGGREGATION:
                        outputPath = parserAggregationPath(projectChart.getGlobal(), domainElement.getName(),
                            templateUrl);
                        break;
                    case VALUE_OBJECT:
                        outputPath = parserAggregationPath(projectChart.getGlobal(), parentAggregation.getName(),
                            templateUrl);
                        break;
                    case COMMAND:
                    case EVENT:
                        outputPath = parserActionPath(projectChart.getGlobal(), parentAggregation.getName(),
                            domainElement.getActionName(), templateUrl);
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
        return parserProjectPath(global, templateUrl)
            // 聚合
            .replace("{polymerization}", aggregationName)
            .replace(DomainElementType.AGGREGATION.getName(), aggregationName);
    }

    /**
     * 解析action路径
     *
     * @param aggregationName 聚合名称
     * @param actionName      action包名
     * @param templateUrl     模板路径
     * @return 解析后的action路径
     */
    private String parserActionPath(Global global, String aggregationName, String actionName, String templateUrl) {
        Objects.requireNonNull(actionName);
        return parserAggregationPath(global, aggregationName, templateUrl)
            .replace("{action}", actionName);
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

}


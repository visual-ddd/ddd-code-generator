package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.enums.ProjectTemplateType;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * 配置模版生成上下文信息
 *
 * @author shimmer
 */
@Data
public class TemplateContext {

    private Map<String, Object> context = new HashMap<>();
    private String preFixOutPath;
    private ZipOutputStream zipOutputStream;
    private Boolean isGenerateProjectFrame = Boolean.TRUE;

    // 默认COLA分层架构
    private ProjectTemplateType projectTemplateType = ProjectTemplateType.COLA;

    public TemplateContext() {
        initTemplateContext();
    }

    public TemplateContext(String preFixOutPath) {
        this();
        this.preFixOutPath = preFixOutPath;
    }

    public TemplateContext(ZipOutputStream zipOutputStream) {
        this();
        this.zipOutputStream = zipOutputStream;
    }

    public void setProjectTemplateType(ProjectTemplateType projectTemplateType) {
        this.projectTemplateType = projectTemplateType;
    }

    /**
     * 配置velocity上下文
     */
    protected void initTemplateContext() {
        // 设置velocity资源加载器
//        Properties properties = new Properties();
//
//        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "plugin");
//        properties.setProperty("plugin.resource.loader.class", PluginResourceLoader.class.getName());
//
//        // 定义字符集
//        properties.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
//        Velocity.setProperty("plugin.resource.loader.instance", pluginResourceLoader);
//        Velocity.init(properties);
    }
}
package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.util.PluginResourceLoader;
import lombok.Data;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
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

    private PluginResourceLoader pluginResourceLoader = new PluginResourceLoader(TemplateContext.class.getClassLoader());

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

    /**
     * 配置velocity上下文
     */
    protected void initTemplateContext() {
        // 设置velocity资源加载器
        Properties properties = new Properties();

        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "plugin");
        properties.setProperty("plugin.resource.loader.class", PluginResourceLoader.class.getName());


//        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
//        properties.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

//        设置velocity资源加载方式为file
//        properties.setProperty("resource.loader", "file");
//        properties.setProperty("file.resource.loader.class", FileResourceLoader.class.getName());
//        properties.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "src/main/resources/");
        // 定义字符集
        properties.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
        Velocity.setProperty("plugin.resource.loader.instance", pluginResourceLoader);
        Velocity.init(properties);
    }
}
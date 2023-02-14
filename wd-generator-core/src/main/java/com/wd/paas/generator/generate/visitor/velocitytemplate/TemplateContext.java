package com.wd.paas.generator.generate.visitor.velocitytemplate;

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
    protected static void initTemplateContext() {
        // 设置velocity资源加载器
        Properties properties = new Properties();
        // 加载classpath目录下的vm文件
        properties.setProperty("resource.loader.file.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 定义字符集
        properties.setProperty(RuntimeConstants.ENCODING_DEFAULT, "UTF-8");
        Velocity.init(properties);
    }
}
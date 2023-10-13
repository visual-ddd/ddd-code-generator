package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.common.util.PluginResourceLoaderV2;
import lombok.Data;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

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
    private ProjectTemplateType projectTemplateType = ProjectTemplateType.COLA;

    private String authorName = "visual-ddd" ;

    // 设置模版引擎
    private VelocityEngine velocityEngine;

    public TemplateContext() {
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
     * 初始化velocity上下文
     */
    public VelocityContext initTemplateContext() {
        VelocityContext velocityContext = new VelocityContext(context);
        velocityContext.put(VelocityLabel.DOMAIN_AUTHOR, authorName);
        return velocityContext;
    }

    /**
     * 设置生成的项目架构类型
     *
     * @param projectTemplateType ProjectTemplateType
     */
    public void setProjectTemplateType(ProjectTemplateType projectTemplateType) {
        this.projectTemplateType = projectTemplateType;
    }

    /**
     * 设置javadoc author注释
     *
     * @param authorName 作者
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * 支持配置自定义Velocity引擎
     *
     * @param velocityEngine 自定义的引擎
     */
    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    /**
     * 根据配置, 创建一个velocity引擎
     *
     * @return velocity引擎
     */
    public VelocityEngine newVelocityEngine() {
        if (velocityEngine != null) return velocityEngine;
        return defaultEngine();
    }

    /**
     * 默认为 Velocity 2.3 版本的引擎配置
     *
     * @return 兼容Velocity 2.3版本的引擎
     */
    private VelocityEngine defaultEngine() {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        this.velocityEngine = velocityEngine;
        return velocityEngine;
    }

}
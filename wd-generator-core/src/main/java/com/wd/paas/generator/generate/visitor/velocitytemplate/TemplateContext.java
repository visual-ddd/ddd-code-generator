package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import lombok.Data;
import org.apache.velocity.VelocityContext;

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

    private String authorName = "visual-ddd";

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

}
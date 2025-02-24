package com.wd.paas.generate2;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * 代码生成入口类
 */
@Slf4j
public class CodeGenerator {

    private final TemplateLoader templateLoader;
    private final VariableResolver variableResolver;
    private final VelocityEngine velocityEngine;

    public CodeGenerator(TemplateLoader templateLoader, VariableResolver variableResolver) {
        this.templateLoader = templateLoader;
        this.variableResolver = variableResolver;

        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(VelocityEngine.RESOURCE_LOADER, "class");
        velocityEngine.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        velocityEngine.setProperty(RuntimeConstants.TOOLBOX_CONFIG, "classpath:toolbox.xml");
        velocityEngine.init();
        this.velocityEngine = velocityEngine;
    }


    public void generate(DslElement element) {
        TemplateMeta template = templateLoader.getTemplate(element.getType());
        if (template == null || !template.isEnabled()) {
            log.warn("Template {} is not enabled or not found", element.getType());
            return;
        }

        // 处理依赖
        template.getDependencies().forEach(depType -> {
            DslElement depElement = DependencyResolver.findDependencyElement(element, depType);
            generate(depElement);
        });

        // 变量解析
        Map<String, Object> context = variableResolver.resolveVariables(element, template);

        // 模板渲染
        String code;
        try (StringWriter writer = new StringWriter()) {
            velocityEngine.mergeTemplate(template.getTemplatePath(), "UTF-8", new VelocityContext(context), writer);
            code = writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to render template: " + template.getTemplatePath(), e);
        }

        // 输出路径解析
        String outputPath = resolveOutputPath(template, context);

        // 写入文件系统
        try {
            FileUtils.writeStringToFile(new File(outputPath), code, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write file: " + outputPath, e);
        }
    }

    protected String resolveOutputPath(TemplateMeta template, Map<String, Object> context) {
        VelocityContext velocityContext = new VelocityContext(context);
        StringWriter writer = new StringWriter();
        velocityEngine.evaluate(velocityContext, writer, "outputPathRule", template.getOutputPathRule());
        return writer.toString();
    }

}

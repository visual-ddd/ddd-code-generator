package com.wd.paas.generate2;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.ToolManager;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 代码生成入口类
 */
@Slf4j
public class CodeGenerator {

    private final TemplateLoader templateLoader;
    private final VariableResolver variableResolver;
    private final VelocityEngine velocityEngine;
    private final Context context;

    public CodeGenerator(TemplateLoader templateLoader, VariableResolver variableResolver) {
        this.templateLoader = templateLoader;
        this.variableResolver = variableResolver;


        // 加载toolbox
        ToolManager manager = new ToolManager();
        manager.configure("newTemplates/toolbox.xml");
        context = manager.createContext();

        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(Velocity.RESOURCE_LOADERS, "class");
        ve.setProperty("resource.loader.class.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        ve.init();
        this.velocityEngine = ve;
    }


    public void generate(DslElement element) {
        List<TemplateMeta> templates = templateLoader.getTemplate(element.getType());
        templates.forEach(template -> singleTempleGenerate(element, template));
    }

    private void singleTempleGenerate(DslElement element, TemplateMeta template) {
        if (template == null || !template.isEnabled()) {
            log.warn("Template {} is not enabled or not found", element.getType());
            return;
        }

        // 处理依赖
        template.getDependencies().forEach(depType -> {
            DslElement depElement = DependencyResolver.findDependencyElement(element, depType);
            // TODO 检查依赖是否已经生成
            generate(depElement);
        });

        // 变量解析
        variableResolver.resolveVariables(element, template, context);

        // 模板渲染
        String code;
        try (StringWriter writer = new StringWriter()) {
            velocityEngine.mergeTemplate(template.getTemplate(), "UTF-8", context, writer);
            code = writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to render template: " + template.getTemplate(), e);
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

    protected String resolveOutputPath(TemplateMeta template, Context context) {
        StringWriter writer = new StringWriter();
        velocityEngine.evaluate(context, writer, "outputPathRule", template.getOutput());
        return writer.toString();
    }

}

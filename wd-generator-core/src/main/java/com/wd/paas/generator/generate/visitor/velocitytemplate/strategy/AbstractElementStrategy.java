package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.context.ElementContent;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.generate.element.ElementNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.generate.visitor.velocitytemplate.VelocityTemplateGenerate;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 元素生成策略抽象类（Velocity 模版生成）
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public abstract class AbstractElementStrategy implements VelocityTemplateGenerate {

    private final ElementNode elementNode;

    protected AbstractElementStrategy(ElementNode elementNode) {
        this.elementNode = elementNode;
    }

    public void initProperties() {
        if (StringUtils.isBlank(elementNode.getDescription())) {
            elementNode.setDescription(elementNode.getTitle());
        }
    }

    @Override
    public void preHandle(TemplateContext templateContext) {
        this.initProperties();
        storeOutPutPath(templateContext);
    }

    @Override
    public void execute(TemplateContext templateContext) {
        VelocityContext velocityContext = new VelocityContext(templateContext.getContext());
        this.putVelocityContext(velocityContext);
        if (Boolean.TRUE.equals(this.process(templateContext))) {
            // 生成文件
            this.generateFile(templateContext, velocityContext);
        }
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return Boolean.TRUE;
    }

    /**
     * 缓存输出路径到导包上下文
     *
     * @param templateContext 上下文信息
     */
    private void storeOutPutPath(TemplateContext templateContext) {
        // 获取模版文件列表
        ElementContent elementContent = new ElementContent(elementNode);
        List<String> templatePathList = Optional.ofNullable(this.getTemplatePathList()).orElse(Collections.emptyList());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getPreFixOutPath());
            ThreadContextHelper.storePath(elementContent, outputPath);
        }

        String elementId = elementNode.getIdentity();
        ThreadLocalUtil.set(elementId, elementContent);
    }

    /**
     * 生成代码模板文件
     *
     * @param templateContext 当前线程上下文信息
     * @param velocityContext 模版框架上下文
     */
    private void generateFile(TemplateContext templateContext, VelocityContext velocityContext) {
        // 获取模版文件列表
        List<String> templatePathList = Optional.ofNullable(this.getTemplatePathList()).orElse(Collections.emptyList());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getPreFixOutPath());
            FileGenerator.run(velocityContext, templateContext.getZipOutputStream(), templateUrl, outputPath);
        }
    }

}

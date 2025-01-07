package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.context.ElementContent;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.common.enums.*;
import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.generate.element.ElementNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.generate.visitor.velocitytemplate.VelocityTemplateGenerate;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

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
        String description = StringUtils.defaultIfBlank(elementNode.getDescription(), elementNode.getTitle());

        if (StringUtils.isNotBlank(description)) {
            elementNode.setDescription(description.replace("\n", "\\n"));
        }
    }

    @Override
    public void preHandle(TemplateContext templateContext) {
        this.initProperties();
        storeOutPutPath(templateContext);
    }

    @Override
    public void execute(TemplateContext templateContext) {
        VelocityContext velocityContext = templateContext.initTemplateContext();
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
        Set<String> templatePathList = Optional.ofNullable(this.getTemplatePathList(getElementMapping(templateContext, Boolean.TRUE)))
                .orElse(Collections.emptySet());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getPreFixOutPath(), templateContext.getProjectTemplateType());
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
        Set<String> templatePathList = Optional.ofNullable(this.getTemplatePathList(getElementMapping(templateContext, Boolean.FALSE))).orElse(Collections.emptySet());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl, templateContext.getPreFixOutPath(), templateContext.getProjectTemplateType());

            boolean isAdded = templateContext.addOutputFileUrl(outputPath);
            if (!isAdded) {
                continue;
            }

            // fixed：IDEA插件线程调用时，类加载器异常
            final ClassLoader oldContextClassLoader = Thread.currentThread().getContextClassLoader();
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());

            FileGenerator.run(velocityContext, templateContext.getZipOutputStream(), templateContext.newVelocityEngine(), templateUrl, outputPath);

            // set back default class loader
            Thread.currentThread().setContextClassLoader(oldContextClassLoader);
        }
    }

    /**
     * 根据 <项目架构类型> 设置不同的模版
     */
    private static AbstractElementMapping getElementMapping(TemplateContext templateContext, Boolean isAllTemplatePath) {
        ProjectTemplateType projectTemplateType = templateContext.getProjectTemplateType();
        AbstractElementMapping elementMapping;
        GenerateOperationTypeEnum operationTypeEnum = Optional.ofNullable(isAllTemplatePath).orElse(Boolean.FALSE) ?
                GenerateOperationTypeEnum.INIT_CODE : templateContext.getOperationTypeEnum();
        switch (projectTemplateType) {
            case COLA:
                elementMapping = new ElementMappingV1(operationTypeEnum);
                break;
            case COLA_SINGLE:
                elementMapping = new ElementMappingV2(operationTypeEnum);
                break;
            case COLA_SINGLE_MVP:
                elementMapping = new ElementMappingSingleMvp(operationTypeEnum);
                break;
            default:
                throw new IllegalStateException("项目架构类型设置非法！");
        }
        return elementMapping;
    }

}

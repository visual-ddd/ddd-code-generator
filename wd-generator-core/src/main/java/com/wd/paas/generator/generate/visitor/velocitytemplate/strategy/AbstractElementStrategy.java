package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.generate.visitor.velocitytemplate.VelocityTemplateGenerate;
import org.apache.velocity.VelocityContext;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 元素生成策略抽象类（Velocity 模版生成）
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public abstract class AbstractElementStrategy implements VelocityTemplateGenerate {

    @Override
    public void preHandle(TemplateContext templateContext) {
        this.putVelocityContext(templateContext.getContext());
        if (Boolean.TRUE.equals(this.process(templateContext))) {
            // 缓存对象映射关系
            storeObjectMapper(templateContext);
            // 获取模版文件列表
            storeOutPutPath(templateContext);
        }
    }

    @Override
    public void execute(TemplateContext templateContext) {
        this.putVelocityContext(templateContext.getContext());
        if (Boolean.TRUE.equals(this.process(templateContext))) {
            this.generateFile(templateContext);
        }
    }

    @Override
    public Boolean process(TemplateContext templateContext) {
        return Boolean.TRUE;
    }

    /**
     * 生成代码模板文件
     *
     * @param templateContext 上下文信息
     */
    private void generateFile(TemplateContext templateContext) {
        // 获取模版文件列表
        List<String> templatePathList = Optional.ofNullable(this.getTemplatePathList()).orElse(Collections.emptyList());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl,
                    templateContext.getPreFixOutPath());
            FileGenerator.run(templateContext.getContext(), templateContext.getZipOutputStream(), templateUrl, outputPath);
        }
    }

    /**
     * 缓存输出路径到导包上下文
     *
     * @param templateContext 上下文信息
     */
    private void storeOutPutPath(TemplateContext templateContext) {
        List<String> templatePathList = Optional.ofNullable(this.getTemplatePathList()).orElse(Collections.emptyList());
        for (String templateUrl : templatePathList) {
            String outputPath = this.parseOutputPath(templateUrl,
                    templateContext.getPreFixOutPath());
            ThreadContextHelper.storePath(outputPath);
        }
    }

    /**
     * 缓存对象映射关系到上下文
     *
     * @param templateContext 上下文信息
     */
    private void storeObjectMapper(TemplateContext templateContext) {
        VelocityContext context = templateContext.getContext();
        if (context.containsKey(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT)
                && context.containsKey(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT)
                && context.containsKey(VelocityLabel.OBJECT_MAPPER_OBJECT_AGGREGATION)) {

            String sourceName = context.get(VelocityLabel.OBJECT_MAPPER_SOURCE_OBJECT).toString();
            String targetName = context.get(VelocityLabel.OBJECT_MAPPER_TARGET_OBJECT).toString();
            ThreadContextHelper.storeObjectMapper(sourceName, targetName);

            if (Objects.nonNull(context.get(VelocityLabel.OBJECT_MAPPER_OBJECT_AGGREGATION))) {
                ThreadContextHelper.storeObjectMapper(targetName, sourceName);
            }
        }
    }

}

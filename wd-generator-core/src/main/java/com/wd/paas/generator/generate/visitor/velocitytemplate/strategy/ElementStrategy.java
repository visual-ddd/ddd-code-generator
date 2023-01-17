package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;

/**
 * @author shimmer
 */
public interface ElementStrategy {

    /**
     * 代码生成策略方法
     *
     * @param templateContext 上下文信息
     */
    void execute(TemplateContext templateContext);

}

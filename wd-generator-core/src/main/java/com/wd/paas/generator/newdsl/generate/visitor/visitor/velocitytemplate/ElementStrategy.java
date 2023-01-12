package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

/**
 * @author shimmer
 */
public interface ElementStrategy {

    /**
     * 代码生成策略方法
     *
     * @param templateContext 上下文信息
     */
    void codeGenerate(TemplateContext templateContext);

}

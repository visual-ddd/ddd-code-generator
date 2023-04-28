package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.context.ThreadLocalUtil;
import com.wd.paas.generator.generate.Visitor;
import com.wd.paas.generator.generate.element.ElementNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.ElementStrategyFactory;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.ElementStrategy;

/**
 * Velocity模版访问者实现类
 *
 * @author shimmer
 */
public class TemplateVisitor implements Visitor {

    /**
     * 模版上下文信息
     */
    private final TemplateContext templateContext;

    public TemplateVisitor(TemplateContext templateContext) {
        this.templateContext = templateContext;
    }

    @Override
    public void preHandle(ElementNode element) {
        ElementStrategy elementStrategy = ElementStrategyFactory.getInstance(element);
        elementStrategy.preHandle(templateContext);
    }

    @Override
    public void generate(ElementNode element) {
        ElementStrategy elementStrategy = ElementStrategyFactory.getInstance(element);
        elementStrategy.execute(templateContext);
    }

    @Override
    public void globalAfterHandle() {
        // 清理velocity模版上下文
        templateContext.getContext().clear();
        // 清理线程上下文
        ThreadLocalUtil.remove();
    }
}

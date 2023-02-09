package com.wd.paas.generator.generate.visitor;

import com.wd.paas.generator.generate.Visitor;
import com.wd.paas.generator.generate.element.ElementNode;
import com.wd.paas.generator.generate.visitor.velocitytemplate.ElementStrategyFactory;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.ElementStrategy;

/**
 * @author shimmer
 */
public class JavaTemplateVisitor implements Visitor {

    private final TemplateContext templateContext;

    public JavaTemplateVisitor(TemplateContext templateContext) {
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
}

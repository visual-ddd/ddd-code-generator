package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.generate.Visitor;
import com.wd.paas.generator.generate.element.Element;
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
    public void visit(Element element) {
        ElementStrategy elementStrategy = ElementStrategyFactory.getInstance(element);
        elementStrategy.execute(templateContext);
    }
}

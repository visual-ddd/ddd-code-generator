package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy.ElementStrategy;

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

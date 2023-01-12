package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate;

import com.wd.paas.generator.newdsl.generate.visitor.element.*;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;

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
        elementStrategy.codeGenerate(templateContext);
    }
}

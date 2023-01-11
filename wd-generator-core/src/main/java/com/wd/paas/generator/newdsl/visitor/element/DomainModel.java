package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;

/**
 * @author wangchensheng
 */
public class DomainModel extends CompositeElement{


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

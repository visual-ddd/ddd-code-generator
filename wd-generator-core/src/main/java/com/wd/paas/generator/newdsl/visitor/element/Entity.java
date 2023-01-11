package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;

/***
 * @author wangchensheng
 */
public class Entity extends LeafElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

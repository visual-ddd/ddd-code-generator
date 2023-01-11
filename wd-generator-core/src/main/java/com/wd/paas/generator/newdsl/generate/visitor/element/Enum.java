package com.wd.paas.generator.newdsl.generate.visitor.element;


import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;

/***
 * @author wangchensheng
 */
public class Enum extends LeafElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

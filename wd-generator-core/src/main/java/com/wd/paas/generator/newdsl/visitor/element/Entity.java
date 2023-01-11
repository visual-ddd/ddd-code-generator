package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;

/***
 * @author： wangchensheng
 * @date： 2023-01-11 16:27
 * @version 1.0
 */
public class Entity extends LeafElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

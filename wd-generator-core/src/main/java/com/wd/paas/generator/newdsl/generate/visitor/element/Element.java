package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;

/**
 * @author shimmer
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}

package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;

import java.util.List;

/**
 * @author shimmer
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}

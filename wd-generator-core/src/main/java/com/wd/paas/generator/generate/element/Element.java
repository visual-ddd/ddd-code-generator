package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;

/**
 * @author shimmer
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}

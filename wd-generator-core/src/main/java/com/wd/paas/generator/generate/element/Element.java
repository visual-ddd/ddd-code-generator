package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;

/**
 * @author shimmer
 */
public class Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

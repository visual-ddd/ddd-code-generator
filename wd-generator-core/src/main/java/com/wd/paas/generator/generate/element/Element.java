package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;

/**
 * 需要生成的元素
 *
 * @author shimmer
 */
public abstract class Element {

    public void preHandle(Visitor visitor) {
        visitor.preHandle(this);
    }

    public void accept(Visitor visitor) {
        visitor.generate(this);
    }

}

package com.wd.paas.generator.newdsl.generate.visitor.visitor;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;

/**
 * 访问者, 提供元素的操作方法
 *
 * @author shimmer
 */
public interface Visitor {

    /**
     * 访问元素方法
     *
     * @param element 元素
     */
    void visit(Element element);

}

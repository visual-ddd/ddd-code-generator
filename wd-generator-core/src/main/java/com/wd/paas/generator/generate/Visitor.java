package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.element.Element;

/**
 * 访问者, 提供具体元素的操作方法
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

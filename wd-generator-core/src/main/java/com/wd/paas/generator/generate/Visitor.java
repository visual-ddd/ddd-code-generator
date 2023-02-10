package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.element.ElementNode;

/**
 * 访问者, 提供具体元素的操作方法
 *
 * @author shimmer
 */
public interface Visitor {

    /**
     * 预解析元素方法
     *
     * @param elementNode 元素节点
     */
    void preHandle(ElementNode elementNode);

    /**
     * 访问元素方法
     *
     * @param elementNode 元素节点
     */
    void generate(ElementNode elementNode);

    /**
     * 后置处理
     *
     * @param elementNode 元素节点
     */
    void afterHandle(ElementNode elementNode);
}

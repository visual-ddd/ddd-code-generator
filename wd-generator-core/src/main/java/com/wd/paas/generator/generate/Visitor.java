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
     * 包含对数据的预处理、缓存临时信息到上下文
     *
     * @param elementNode 元素节点
     */
    void preHandle(ElementNode elementNode);

    /**
     * 代码生成逻辑
     * 根据映射规则生成对应的代码文件
     *
     * @param elementNode 元素节点
     */
    void generate(ElementNode elementNode);

    /**
     * 统一后置处理方法
     */
    void globalAfterHandle();
}

package com.wd.paas.generator.generate.element;

import lombok.Data;

/**
 * 需要遍历的元素节点（多叉树）
 *
 * @author shimmer
 */
@Data
public abstract class ElementNode {

    private ElementNode parentNode;

}

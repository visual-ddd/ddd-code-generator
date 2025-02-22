package com.wd.paas.generator.generate.element;

import com.wd.paas.common.Named;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 需要遍历的元素节点（多叉树）
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ElementNode extends Named {

    private ElementNode parentNode;

}

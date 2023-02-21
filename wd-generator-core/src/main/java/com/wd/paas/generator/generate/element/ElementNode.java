package com.wd.paas.generator.generate.element;

import com.wd.paas.common.Named;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

/**
 * 需要遍历的元素节点（多叉树）
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class ElementNode extends Named {

    private ElementNode parentNode;


    public void initProperties() {
        if (StringUtils.isBlank(this.getDescription())) {
            this.setDescription(this.getTitle());
        }
    }
}

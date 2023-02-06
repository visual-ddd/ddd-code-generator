package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用元素
 *
 * @author zhuxueliang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTApplication extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String version;

    private String packageName;

}

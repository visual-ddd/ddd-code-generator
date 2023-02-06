package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTBusinessDomain extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String vision;

    private String document;

}

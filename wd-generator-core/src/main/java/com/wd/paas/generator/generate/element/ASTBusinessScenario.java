package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTBusinessScenario extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String version;

}
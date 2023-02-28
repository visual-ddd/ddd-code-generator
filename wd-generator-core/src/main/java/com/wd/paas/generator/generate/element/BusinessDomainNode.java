package com.wd.paas.generator.generate.element;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessDomainNode extends CompositeElement {

    private String vision;

    private String document;

    private String domainAllLowerName;
}

package com.wd.paas.generator.generate.element;

import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTAggregate extends CompositeElement {

    private ASTAggregateRoot root;

}

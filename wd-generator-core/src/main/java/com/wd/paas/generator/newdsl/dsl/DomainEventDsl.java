package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class DomainEventDsl {

    private String name;

    private String description;

    private List<PropertyDsl> propertyDslList;

}

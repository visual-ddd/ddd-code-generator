package com.wd.paas.generator.newdsl.input.dsl;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class CommandParameterDsl {

    private String name;

    private String description;

    private List<PropertyDsl> propertyList;

}

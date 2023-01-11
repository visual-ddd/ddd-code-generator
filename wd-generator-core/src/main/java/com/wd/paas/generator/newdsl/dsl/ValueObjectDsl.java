package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class ValueObjectDsl implements Serializable {

    private String name;

    private String description;

    private List<PropertyDsl> properties;

    private List<Method> methods;
}

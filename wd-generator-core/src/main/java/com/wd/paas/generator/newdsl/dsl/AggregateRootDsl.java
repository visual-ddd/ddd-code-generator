package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class AggregateRootDsl implements Serializable {

    private String name;

    private String description;

    private Boolean isAbstract;

    private PropertyDsl id;

    private List<PropertyDsl> properties;
}

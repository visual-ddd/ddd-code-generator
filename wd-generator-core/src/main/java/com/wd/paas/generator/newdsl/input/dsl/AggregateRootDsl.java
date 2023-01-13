package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.MethodInfo;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class AggregateRootDsl {

    private String name;

    private String description;

    private Boolean isAbstract;

    private PropertyInfo id;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodList;
}

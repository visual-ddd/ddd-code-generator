package com.wd.paas.generator.generate.element;

import com.wd.paas.common.PropertyInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTDomainEvent extends LeafElement {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

}

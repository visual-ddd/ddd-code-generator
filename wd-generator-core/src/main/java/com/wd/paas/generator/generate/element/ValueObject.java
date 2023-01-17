package com.wd.paas.generator.generate.element;


import com.wd.paas.generator.common.MethodInfo;
import com.wd.paas.generator.common.PropertyInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author  wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ValueObject extends LeafElement {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

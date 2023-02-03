package com.wd.paas.generator.generate.element;


import com.wd.paas.common.MethodInfo;
import com.wd.paas.common.PropertyInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTEntity extends LeafElement{

    private String name;

    private String description;

    private Boolean isAbstract;

    private PropertyInfo id;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodInfoList;

    @Override
    public void accept(Visitor visitor) {
        visitor.generate(this);
    }
}

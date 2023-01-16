package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DomainEvent extends LeafElement {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

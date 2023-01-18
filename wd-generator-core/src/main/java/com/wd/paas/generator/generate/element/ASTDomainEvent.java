package com.wd.paas.generator.generate.element;

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
public class ASTDomainEvent extends LeafElement {

    private String name;

    private String description;

    private List<PropertyInfo> propertyList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

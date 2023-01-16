package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessDomain extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private List<PropertyInfo> meta;

    private String vision;

    private String document;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package com.wd.paas.generator.generate.element;

import com.wd.paas.common.PropertyInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTBusinessDomain extends CompositeElement {

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

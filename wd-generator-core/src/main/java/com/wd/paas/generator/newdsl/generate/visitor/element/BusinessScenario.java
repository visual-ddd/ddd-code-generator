package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessScenario extends CompositeElement {

    private String title;

    private String name;

    private String description;

    private List<PropertyInfo> meta;

    private String version;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
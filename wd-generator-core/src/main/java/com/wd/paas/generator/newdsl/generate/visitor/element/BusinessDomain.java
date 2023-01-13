package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessDomain extends CompositeElement {

    private Info info;

    private Versionable versionable;

    private String vision;

    private String document;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

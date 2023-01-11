package com.wd.paas.generator.newdsl.visitor.element;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.visitor.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessDomain extends CompositeElement {

    private Info info;

    private Versionable versionable;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

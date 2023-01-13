package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DomainModel extends CompositeElement {

    private List<Aggregate> aggregateList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

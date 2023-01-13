package com.wd.paas.generator.newdsl.generate.visitor.element;

import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Aggregate extends CompositeElement {

    private AggregateRoot aggregateRoot;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

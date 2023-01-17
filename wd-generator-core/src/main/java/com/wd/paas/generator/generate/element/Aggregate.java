package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Aggregate extends CompositeElement {

    private AggregateRoot root;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

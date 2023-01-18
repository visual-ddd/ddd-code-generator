package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DomainModel extends CompositeElement {

    private List<ASTAggregate> ASTAggregateList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

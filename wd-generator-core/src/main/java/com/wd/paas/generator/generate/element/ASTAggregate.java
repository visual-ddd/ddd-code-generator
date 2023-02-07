package com.wd.paas.generator.generate.element;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTAggregate extends CompositeElement {

    private ASTAggregateRoot root;

    public List<ASTCommand> getCommandList() {
        return getChildElementList(ASTCommand.class);
    }
}

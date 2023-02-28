package com.wd.paas.generator.generate.element;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateNode extends CompositeElement {

    public List<CommandNode> getCommandList() {
        return getChildElementList(CommandNode.class);
    }
}

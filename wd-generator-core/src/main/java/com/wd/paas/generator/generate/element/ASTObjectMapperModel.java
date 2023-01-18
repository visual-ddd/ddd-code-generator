package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ASTObjectMapperModel extends CompositeElement {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.generate.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTDataModel extends CompositeElement {
    public void accept(Visitor visitor) {
        visitor.generate(this);
    }
}

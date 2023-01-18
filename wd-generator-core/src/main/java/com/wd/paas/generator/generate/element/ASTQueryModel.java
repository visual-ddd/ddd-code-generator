package com.wd.paas.generator.generate.element;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ASTQueryModel extends CompositeElement {

    private List<ASTQuery> queryDslList;

    private List<ASTDto> dtoDslList;
}

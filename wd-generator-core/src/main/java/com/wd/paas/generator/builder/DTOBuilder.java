package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.builder.convert.DTODslConvert;
import com.wd.paas.generator.generate.element.ASTDto;
import com.wd.paas.generator.generate.element.ASTQueryModel;

public class DTOBuilder {

    static ASTDto build(DtoDsl dtoDsl, ASTQueryModel queryModel) {
        ASTDto astDto = DTODslConvert.INSTANCE.dto2Do(dtoDsl);
        astDto.setParentNode(queryModel);
        return astDto;
    }
}

package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.builder.convert.DTODslConvert;
import com.wd.paas.generator.generate.element.ASTDto;

public class DTOBuilder {

    static ASTDto build(DtoDsl dtoDsl) {
        return DTODslConvert.INSTANCE.dto2Do(dtoDsl);
    }
}

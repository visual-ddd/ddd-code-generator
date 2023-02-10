package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.builder.convert.DTODslConvert;
import com.wd.paas.generator.generate.element.DtoNode;
import com.wd.paas.generator.generate.element.QueryModelNode;

public class DTOBuilder {

    static DtoNode build(DtoDsl dtoDsl, QueryModelNode queryModel) {
        DtoNode astDto = DTODslConvert.INSTANCE.dto2Do(dtoDsl);
        astDto.setParentNode(queryModel);
        return astDto;
    }
}

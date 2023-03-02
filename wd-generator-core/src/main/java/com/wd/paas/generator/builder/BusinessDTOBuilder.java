package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.builder.convert.BusinessDTODslConvert;
import com.wd.paas.generator.generate.element.BusinessDTONode;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;

public class BusinessDTOBuilder {

    static BusinessDTONode build(DtoDsl dtoDsl, BusinessServiceModelNode parentNode) {
        BusinessDTONode businessDTONode = BusinessDTODslConvert.INSTANCE.dto2Do(dtoDsl);
        businessDTONode.setParentNode(parentNode);
        return businessDTONode;
    }
}

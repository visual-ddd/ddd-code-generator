package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DataObjectDsl;
import com.wd.paas.generator.builder.convert.DataObjectDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.DataObjectNode;

public class DataObjectBuilder {
    static DataObjectNode build(DataObjectDsl dataObjectDsl, BusinessDomainNode astBusinessDomain) {
        DataObjectNode astDataObject = DataObjectDslConvert.INSTANCE.dto2Do(dataObjectDsl);
        astDataObject.setParentNode(astBusinessDomain);
        return astDataObject;
    }
}
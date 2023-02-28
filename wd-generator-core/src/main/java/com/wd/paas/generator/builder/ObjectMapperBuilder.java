package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ObjectMapperDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.ObjectMapperNode;

public class ObjectMapperBuilder {
    public static ObjectMapperNode build(ObjectMapperDsl objectMapperDsl, BusinessDomainNode astBusinessDomain) {
        ObjectMapperNode astObjectMapper = ObjectMapperDslConvert.INSTANCE.dto2Do(objectMapperDsl);
        astObjectMapper.setParentNode(astBusinessDomain);
        return astObjectMapper;
    }
}
package com.wd.paas.generator.builder;

import com.wd.paas.common.ObjectReference;
import com.wd.paas.dsl.ObjectMapperDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.ObjectMapperNode;
import org.apache.commons.lang3.StringUtils;

public class ObjectMapperBuilder {
    public static ObjectMapperNode build(ObjectMapperDsl objectMapperDsl, BusinessDomainNode astBusinessDomain) {
        ObjectReference source = objectMapperDsl.getSource();
        source.setParent(convertAggregationName(source.getParent()));

        ObjectMapperNode astObjectMapper = ObjectMapperDslConvert.INSTANCE.dto2Do(objectMapperDsl);
        astObjectMapper.setParentNode(astBusinessDomain);
        return astObjectMapper;
    }

    private static String convertAggregationName(String aggregationName) {
        return StringUtils.isBlank(aggregationName) ? null : aggregationName.toLowerCase();
    }
}
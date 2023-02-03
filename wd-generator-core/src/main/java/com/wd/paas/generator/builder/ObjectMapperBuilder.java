package com.wd.paas.generator.builder;

import com.wd.paas.common.ObjectReference;
import com.wd.paas.dsl.ObjectMapperDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperDslConvert;
import com.wd.paas.generator.generate.element.ASTObjectMapper;
import org.apache.commons.lang3.StringUtils;

public class ObjectMapperBuilder {
    public static ASTObjectMapper build(ObjectMapperDsl objectMapperDsl) {
        ObjectReference source = objectMapperDsl.getSource();
        source.setParent(convertAggregationName(source.getParent()));
        return ObjectMapperDslConvert.INSTANCE.dto2Do(objectMapperDsl);
    }

    private static String convertAggregationName(String aggregationName) {
        return StringUtils.isBlank(aggregationName) ? null : aggregationName.toLowerCase();
    }
}
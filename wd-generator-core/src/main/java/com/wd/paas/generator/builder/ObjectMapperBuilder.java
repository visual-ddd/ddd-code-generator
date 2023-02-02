package com.wd.paas.generator.builder;

import com.wd.paas.common.ObjectReferenceInfo;
import com.wd.paas.dsl.ObjectMapperDsl;
import com.wd.paas.dsl.ObjectMapperModelDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperDslConvert;
import com.wd.paas.generator.builder.convert.ObjectMapperModelDslConvert;
import com.wd.paas.generator.generate.element.ASTObjectMapper;
import com.wd.paas.generator.generate.element.ASTObjectMapperModel;
import org.apache.commons.lang3.StringUtils;

public class ObjectMapperBuilder {
    public static ASTObjectMapper build(ObjectMapperDsl objectMapperDsl) {
        ObjectReferenceInfo source = objectMapperDsl.getSource();
        source.setParent(convertAggregationName(source.getParent()));
        return ObjectMapperDslConvert.INSTANCE.dto2Do(objectMapperDsl);
    }

    private static String convertAggregationName(String aggregationName) {
        return StringUtils.isBlank(aggregationName) ? null : aggregationName.toLowerCase();
    }
}
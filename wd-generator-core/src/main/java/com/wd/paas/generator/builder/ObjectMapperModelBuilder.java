package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ObjectMapperModelDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperModelDslConvert;
import com.wd.paas.generator.generate.element.ASTObjectMapperModel;

public class ObjectMapperModelBuilder {
    public static ASTObjectMapperModel build(ObjectMapperModelDsl objectMapperModelDsl) {
        return ObjectMapperModelDslConvert.INSTANCE.dto2Do(objectMapperModelDsl);
    }
}
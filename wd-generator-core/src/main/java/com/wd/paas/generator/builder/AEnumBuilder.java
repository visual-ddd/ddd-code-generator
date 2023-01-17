package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.generator.builder.convert.EnumDslConvert;
import com.wd.paas.generator.generate.element.AEnum;

public class AEnumBuilder {
    public static AEnum build(EnumDsl enumDsl) {
        return EnumDslConvert.INSTANCE.dto2Do(enumDsl);
    }
}
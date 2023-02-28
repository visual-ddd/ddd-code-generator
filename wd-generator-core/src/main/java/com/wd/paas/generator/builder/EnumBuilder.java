package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.generator.builder.convert.EnumDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EnumNode;

public class EnumBuilder {

    public static EnumNode build(EnumDsl enumDsl, AggregateNode astAggregate) {
        EnumNode astEnum = EnumDslConvert.INSTANCE.dto2Do(enumDsl);
        astEnum.setParentNode(astAggregate);
        return astEnum;
    }
}
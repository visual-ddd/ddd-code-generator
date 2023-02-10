package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.generator.builder.convert.EnumDslConvert;
import com.wd.paas.generator.generate.element.ASTAggregate;
import com.wd.paas.generator.generate.element.ASTEnum;

public class EnumBuilder {
    public static ASTEnum build(EnumDsl enumDsl, ASTAggregate astAggregate) {
        ASTEnum astEnum = EnumDslConvert.INSTANCE.dto2Do(enumDsl);
        astEnum.setParentNode(astAggregate);
        return astEnum;
    }
}
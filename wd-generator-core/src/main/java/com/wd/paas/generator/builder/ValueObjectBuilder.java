package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ValueObjectDsl;
import com.wd.paas.generator.builder.convert.ValueObjectDslConvert;
import com.wd.paas.generator.generate.element.ASTValueObject;

public class ValueObjectBuilder {
    public static ASTValueObject build(ValueObjectDsl valueObjectDsl) {
        return ValueObjectDslConvert.INSTANCE.dto2Do(valueObjectDsl);
    }
}
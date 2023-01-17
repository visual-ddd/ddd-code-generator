package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ValueObjectDsl;
import com.wd.paas.generator.builder.convert.ValueObjectDslConvert;
import com.wd.paas.generator.generate.element.ValueObject;

public class ValueObjectBuilder {
    public static ValueObject build(ValueObjectDsl valueObjectDsl) {
        return ValueObjectDslConvert.INSTANCE.dto2Do(valueObjectDsl);
    }
}
package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ValueObjectDsl;
import com.wd.paas.generator.builder.convert.ValueObjectDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.ValueObjectNode;

public class ValueObjectBuilder {
    public static ValueObjectNode build(ValueObjectDsl valueObjectDsl, AggregateNode astAggregate) {
        ValueObjectNode astValueObject = ValueObjectDslConvert.INSTANCE.dto2Do(valueObjectDsl);
        astValueObject.setParentNode(astAggregate);
        return astValueObject;
    }
}
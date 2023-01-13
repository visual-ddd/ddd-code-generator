package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.ValueObject;
import com.wd.paas.generator.newdsl.input.dsl.ValueObjectDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ValueObjectDslConvert extends BaseConvert<ValueObjectDsl, ValueObject> {

    ValueObjectDslConvert INSTANCE = Mappers.getMapper(ValueObjectDslConvert.class);
}

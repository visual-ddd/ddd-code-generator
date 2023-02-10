package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.ValueObjectDsl;
import com.wd.paas.generator.generate.element.ValueObjectNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ValueObjectDslConvert extends BaseConvert<ValueObjectDsl, ValueObjectNode> {

    ValueObjectDslConvert INSTANCE = Mappers.getMapper(ValueObjectDslConvert.class);
}

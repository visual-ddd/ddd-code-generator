package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.ValueObjectDsl;
import com.wd.paas.generator.generate.element.ASTValueObject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ValueObjectDslConvert extends BaseConvert<ValueObjectDsl, ASTValueObject> {

    ValueObjectDslConvert INSTANCE = Mappers.getMapper(ValueObjectDslConvert.class);
}

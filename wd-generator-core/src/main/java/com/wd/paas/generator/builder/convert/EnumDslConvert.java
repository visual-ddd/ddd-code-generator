package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.generator.generate.element.ASTEnum;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface EnumDslConvert extends BaseConvert<EnumDsl, ASTEnum> {

    EnumDslConvert INSTANCE = Mappers.getMapper(EnumDslConvert.class);
}

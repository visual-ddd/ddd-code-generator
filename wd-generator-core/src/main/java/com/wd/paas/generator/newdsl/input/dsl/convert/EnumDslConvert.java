package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.AEnum;
import com.wd.paas.generator.newdsl.input.dsl.EnumDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface EnumDslConvert extends BaseConvert<EnumDsl, AEnum> {

    EnumDslConvert INSTANCE = Mappers.getMapper(EnumDslConvert.class);
}

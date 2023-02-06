package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.ObjectMapperDsl;
import com.wd.paas.generator.generate.element.ASTObjectMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ObjectMapperDslConvert extends BaseConvert<ObjectMapperDsl, ASTObjectMapper> {

    ObjectMapperDslConvert INSTANCE = Mappers.getMapper(ObjectMapperDslConvert.class);
}

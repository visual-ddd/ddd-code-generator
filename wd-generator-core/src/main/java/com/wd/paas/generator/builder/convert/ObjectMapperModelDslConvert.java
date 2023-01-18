package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.dsl.ObjectMapperModelDsl;
import com.wd.paas.generator.generate.element.ASTEnum;
import com.wd.paas.generator.generate.element.ASTObjectMapperModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ObjectMapperModelDslConvert extends BaseConvert<ObjectMapperModelDsl, ASTObjectMapperModel> {

    ObjectMapperModelDslConvert INSTANCE = Mappers.getMapper(ObjectMapperModelDslConvert.class);
}

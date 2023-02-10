package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.ObjectMapperModelDsl;
import com.wd.paas.generator.generate.element.ObjectMapperModelNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface ObjectMapperModelDslConvert extends BaseConvert<ObjectMapperModelDsl, ObjectMapperModelNode> {

    ObjectMapperModelDslConvert INSTANCE = Mappers.getMapper(ObjectMapperModelDslConvert.class);
}

package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.EntityDsl;
import com.wd.paas.generator.generate.element.EntityNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface EntityDslConvert extends BaseConvert<EntityDsl, EntityNode> {

    EntityDslConvert INSTANCE = Mappers.getMapper(EntityDslConvert.class);
}

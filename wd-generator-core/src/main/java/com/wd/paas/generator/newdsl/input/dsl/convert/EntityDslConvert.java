package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.Entity;
import com.wd.paas.generator.newdsl.input.dsl.EntityDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper
public interface EntityDslConvert extends BaseConvert<EntityDsl, Entity> {

    EntityDslConvert INSTANCE = Mappers.getMapper(EntityDslConvert.class);
}

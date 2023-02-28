package com.wd.paas.generator.builder.convert;

import com.wd.paas.common.enums.RepositoryTypeEnumConvert;
import com.wd.paas.dsl.EntityDsl;
import com.wd.paas.generator.generate.element.AggregateRootNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wangchensheng
 */
@Mapper(uses = {
        RepositoryTypeEnumConvert.class
})
public interface AggregateRootDslConvert extends BaseConvert<EntityDsl, AggregateRootNode> {

    AggregateRootDslConvert INSTANCE = Mappers.getMapper(AggregateRootDslConvert.class);
}

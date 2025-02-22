package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.generate.element.QueryModelNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface QueryModelDslConvert extends BaseConvert<QueryModelDsl, QueryModelNode> {

    QueryModelDslConvert INSTANCE = Mappers.getMapper(QueryModelDslConvert.class);
}

package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.generate.element.QueryNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface QueryDslConvert extends BaseConvert<QueryDsl, QueryNode> {

    QueryDslConvert INSTANCE = Mappers.getMapper(QueryDslConvert.class);
}

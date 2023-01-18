package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.generate.element.ASTQuery;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface QueryDslConvert extends BaseConvert<QueryDsl, ASTQuery> {

    QueryDslConvert INSTANCE = Mappers.getMapper(QueryDslConvert.class);
}

package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.generate.element.BusinessQueryNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessQueryDslConvert extends BaseConvert<QueryDsl, BusinessQueryNode> {

    BusinessQueryDslConvert INSTANCE = Mappers.getMapper(BusinessQueryDslConvert.class);
}

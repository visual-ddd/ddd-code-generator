package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessServiceModelDslConvert extends BaseConvert<QueryModelDsl, BusinessServiceModelNode> {

    BusinessServiceModelDslConvert INSTANCE = Mappers.getMapper(BusinessServiceModelDslConvert.class);
}

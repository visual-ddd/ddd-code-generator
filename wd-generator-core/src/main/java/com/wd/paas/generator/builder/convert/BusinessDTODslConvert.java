package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.DtoDsl;
import com.wd.paas.generator.generate.element.BusinessDTONode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDTODslConvert extends BaseConvert<DtoDsl, BusinessDTONode> {

    BusinessDTODslConvert INSTANCE = Mappers.getMapper(BusinessDTODslConvert.class);
}

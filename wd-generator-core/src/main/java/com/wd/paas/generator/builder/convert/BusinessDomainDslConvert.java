package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDomainDslConvert extends BaseConvert<BusinessDomainDsl, BusinessDomainNode> {

    BusinessDomainDslConvert INSTANCE = Mappers.getMapper(BusinessDomainDslConvert.class);
}

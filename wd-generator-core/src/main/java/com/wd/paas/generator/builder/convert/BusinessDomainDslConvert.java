package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.input.BusinessDomainDsl;
import com.wd.paas.generator.generate.element.BusinessDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDomainDslConvert extends BaseConvert<BusinessDomainDsl, BusinessDomain> {

    BusinessDomainDslConvert INSTANCE = Mappers.getMapper(BusinessDomainDslConvert.class);
}

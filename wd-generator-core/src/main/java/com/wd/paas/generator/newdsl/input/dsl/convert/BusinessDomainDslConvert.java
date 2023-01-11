package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.input.dsl.BusinessDomainDsl;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDomainDslConvert extends BaseConvert<BusinessDomainDsl, BusinessDomain> {

    BusinessDomainDslConvert INSTANCE = Mappers.getMapper(BusinessDomainDslConvert.class);
}

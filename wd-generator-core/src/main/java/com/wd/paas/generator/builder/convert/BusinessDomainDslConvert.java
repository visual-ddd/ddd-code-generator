package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.generate.element.ASTBusinessDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDomainDslConvert extends BaseConvert<BusinessDomainDsl, ASTBusinessDomain> {

    BusinessDomainDslConvert INSTANCE = Mappers.getMapper(BusinessDomainDslConvert.class);
}

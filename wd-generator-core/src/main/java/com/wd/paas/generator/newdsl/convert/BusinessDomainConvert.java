package com.wd.paas.generator.newdsl.convert;

import com.wd.paas.generator.newdsl.dsl.BusinessDomainDsl;
import com.wd.paas.generator.newdsl.visitor.element.BusinessDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessDomainConvert extends BaseConvert<BusinessDomainDsl, BusinessDomain> {

    BusinessDomainConvert INSTANCE = Mappers.getMapper(BusinessDomainConvert.class);
}

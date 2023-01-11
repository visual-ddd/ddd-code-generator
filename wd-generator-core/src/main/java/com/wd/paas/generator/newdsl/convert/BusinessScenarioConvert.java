package com.wd.paas.generator.newdsl.convert;

import com.wd.paas.generator.newdsl.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.newdsl.visitor.element.BusinessScenario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessScenarioConvert extends BaseConvert<BusinessScenarioDsl, BusinessScenario> {

    BusinessScenarioConvert INSTANCE = Mappers.getMapper(BusinessScenarioConvert.class);
}

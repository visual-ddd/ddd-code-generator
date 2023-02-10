package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessScenarioDslConvert extends BaseConvert<BusinessScenarioDsl, BusinessScenarioNode> {

    BusinessScenarioDslConvert INSTANCE = Mappers.getMapper(BusinessScenarioDslConvert.class);
}

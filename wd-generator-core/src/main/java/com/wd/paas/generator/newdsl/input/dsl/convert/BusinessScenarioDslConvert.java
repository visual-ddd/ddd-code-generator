package com.wd.paas.generator.newdsl.input.dsl.convert;

import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessScenario;
import com.wd.paas.generator.newdsl.input.dsl.BusinessScenarioDsl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessScenarioDslConvert extends BaseConvert<BusinessScenarioDsl, BusinessScenario> {

    BusinessScenarioDslConvert INSTANCE = Mappers.getMapper(BusinessScenarioDslConvert.class);
}

package com.wd.paas.generator.builder.convert;

import com.wd.paas.generator.input.BusinessScenarioDsl;
import com.wd.paas.generator.generate.element.BusinessScenario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessScenarioDslConvert extends BaseConvert<BusinessScenarioDsl, BusinessScenario> {

    BusinessScenarioDslConvert INSTANCE = Mappers.getMapper(BusinessScenarioDslConvert.class);
}

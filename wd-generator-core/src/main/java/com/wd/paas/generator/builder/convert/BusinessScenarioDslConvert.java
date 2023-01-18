package com.wd.paas.generator.builder.convert;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.generate.element.ASTBusinessScenario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shimmer
 */
@Mapper
public interface BusinessScenarioDslConvert extends BaseConvert<BusinessScenarioDsl, ASTBusinessScenario> {

    BusinessScenarioDslConvert INSTANCE = Mappers.getMapper(BusinessScenarioDslConvert.class);
}

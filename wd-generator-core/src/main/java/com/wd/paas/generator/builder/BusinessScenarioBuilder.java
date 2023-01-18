package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.builder.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.generate.element.ASTBusinessScenario;

public class BusinessScenarioBuilder {

    public static ASTBusinessScenario build(BusinessScenarioDsl businessScenarioDsl) {
        return BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
    }

}

package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.builder.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.generate.element.BusinessScenario;

public class BusinessScenarioBuilder {

    public static BusinessScenario build(BusinessScenarioDsl businessScenarioDsl) {
        return BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
    }

}

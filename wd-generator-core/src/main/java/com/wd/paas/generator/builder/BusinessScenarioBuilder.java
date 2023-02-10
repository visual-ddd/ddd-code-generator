package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.builder.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;

public class BusinessScenarioBuilder {

    public static BusinessScenarioNode build(BusinessScenarioDsl businessScenarioDsl, ApplicationNode astApplication) {
        BusinessScenarioNode astBusinessScenario = BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
        astBusinessScenario.setParentNode(astApplication);
        return astBusinessScenario;
    }

}

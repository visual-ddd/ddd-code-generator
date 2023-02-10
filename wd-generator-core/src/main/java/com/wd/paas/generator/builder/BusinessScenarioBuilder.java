package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.builder.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.element.ASTBusinessScenario;

public class BusinessScenarioBuilder {

    public static ASTBusinessScenario build(BusinessScenarioDsl businessScenarioDsl, ASTApplication astApplication) {
        ASTBusinessScenario astBusinessScenario = BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
        astBusinessScenario.setParentNode(astApplication);
        return astBusinessScenario;
    }

}

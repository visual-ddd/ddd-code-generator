package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.builder.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;
import com.wd.paas.generator.generate.element.ElementNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BusinessScenarioBuilder {

    public static BusinessScenarioNode build(BusinessScenarioDsl businessScenarioDsl, ApplicationNode astApplication) {
        BusinessScenarioNode astBusinessScenario = BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
        if (StringUtils.isBlank(astBusinessScenario.getIdentity())) {
            astBusinessScenario.setIdentity(UUID.randomUUID().toString());
        }

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(businessScenarioDsl.getServiceModel()).ifPresent(serviceModel -> elements.add(BusinessServiceModelBuilder.build(serviceModel, astBusinessScenario)));
        astBusinessScenario.addAll(elements);
        astBusinessScenario.setParentNode(astApplication);
        return astBusinessScenario;
    }

}

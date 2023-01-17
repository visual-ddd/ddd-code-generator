package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.builder.convert.ApplicationDslConvert;
import com.wd.paas.generator.generate.element.Application;
import com.wd.paas.generator.generate.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApplicationBuilder {

    public static Application build(ApplicationDsl applicationDsl) {
        Application application = ApplicationDslConvert.INSTANCE.dto2Do(applicationDsl);

        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(applicationDsl.getBusinessDomainList()).ifPresent(e -> e.stream().map(BusinessDomainBuilder::build).forEach(elements::add));
        Optional.ofNullable(applicationDsl.getBusinessScenarioList()).ifPresent(e -> e.stream().map(BusinessScenarioBuilder::build).forEach(elements::add));
        application.addAll(elements);
        return application;
    }
}
package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.builder.convert.ApplicationDslConvert;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApplicationBuilder {

    public static ASTApplication build(ApplicationDsl applicationDsl) {
        ASTApplication astApplication = ApplicationDslConvert.INSTANCE.dto2Do(applicationDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(applicationDsl.getBusinessDomainList()).ifPresent(e -> e.stream().map(businessDomainDsl -> BusinessDomainBuilder.build(businessDomainDsl, astApplication)).forEach(elements::add));
        Optional.ofNullable(applicationDsl.getBusinessScenarioList()).ifPresent(e -> e.stream().map(businessScenarioDsl -> BusinessScenarioBuilder.build(businessScenarioDsl, astApplication)).forEach(elements::add));
        astApplication.addAll(elements);
        return astApplication;
    }
}
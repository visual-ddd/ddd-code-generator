package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainModelDsl;
import com.wd.paas.generator.builder.convert.DomainModelDslConvert;
import com.wd.paas.generator.generate.element.DomainModel;
import com.wd.paas.generator.generate.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DomainModelBuilder {
    public static DomainModel build(DomainModelDsl domainModelDsl) {
        DomainModel domainModel = DomainModelDslConvert.INSTANCE.dto2Do(domainModelDsl);
        List<Element> elements = new ArrayList<Element>();
        Optional.ofNullable(domainModelDsl.getAggregateList()).ifPresent(e -> e.stream().map(AggregateBuilder::build).forEach(elements::add));
        domainModel.addAll(elements);
        return domainModel;
    }
}
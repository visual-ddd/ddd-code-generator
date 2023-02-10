package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainModelDsl;
import com.wd.paas.generator.builder.convert.DomainModelDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.DomainModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DomainModelBuilder {

    public static DomainModelNode build(DomainModelDsl domainModelDsl, BusinessDomainNode astBusinessDomain) {
        DomainModelNode domainModel = DomainModelDslConvert.INSTANCE.dto2Do(domainModelDsl);
        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(domainModelDsl.getAggregateList()).ifPresent(e -> e.stream().map(aggregateDsl -> AggregateBuilder.build(aggregateDsl, domainModel)).forEach(elements::add));
        domainModel.addAll(elements);
        domainModel.setParentNode(astBusinessDomain);
        return domainModel;
    }
}
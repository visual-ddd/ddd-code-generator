package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainModelDsl;
import com.wd.paas.generator.builder.convert.DomainModelDslConvert;
import com.wd.paas.generator.generate.element.ASTBusinessDomain;
import com.wd.paas.generator.generate.element.ASTDomainModel;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DomainModelBuilder {

    public static ASTDomainModel build(DomainModelDsl domainModelDsl, ASTBusinessDomain astBusinessDomain) {
        ASTDomainModel domainModel = DomainModelDslConvert.INSTANCE.dto2Do(domainModelDsl);
        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(domainModelDsl.getAggregateList()).ifPresent(e -> e.stream().map(aggregateDsl -> AggregateBuilder.build(aggregateDsl, domainModel)).forEach(elements::add));
        domainModel.addAll(elements);
        domainModel.setParentNode(astBusinessDomain);
        return domainModel;
    }
}
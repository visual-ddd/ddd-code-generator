package com.wd.paas.generator.builder;

import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.generator.builder.convert.AggregateDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.DomainModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AggregateBuilder {
    public static AggregateNode build(AggregateDsl aggregateDsl, DomainModelNode domainModel) {
        AggregateNode astAggregate = AggregateDslConvert.INSTANCE.dto2Do(aggregateDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(aggregateDsl.getRoot()).ifPresent(rootDsl -> elements.add(AggregateRootBuilder.build(rootDsl, astAggregate)));
        Optional.ofNullable(aggregateDsl.getEntityList()).ifPresent(e -> e.stream().map(entityDsl -> EntityBuilder.build(entityDsl, astAggregate)).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getValueObjectList()).ifPresent(e -> e.stream().map(valueObjectDsl -> ValueObjectBuilder.build(valueObjectDsl, astAggregate)).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getCommandList()).ifPresent(e -> e.stream().map(commandDsl -> CommandBuilder.build(commandDsl, astAggregate)).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getEnumList()).ifPresent(e -> e.stream().map(enumDsl -> EnumBuilder.build(enumDsl, astAggregate)).forEach(elements::add));
        astAggregate.addAll(elements);

        astAggregate.setParentNode(domainModel);
        return astAggregate;
    }
}
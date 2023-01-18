package com.wd.paas.generator.builder;

import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.generator.builder.convert.AggregateDslConvert;
import com.wd.paas.generator.generate.element.ASTAggregate;
import com.wd.paas.generator.generate.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AggregateBuilder {
    public static ASTAggregate build(AggregateDsl aggregateDsl) {
        List<Element> elements = new ArrayList<Element>();
        Optional.ofNullable(aggregateDsl.getEntityList()).ifPresent(e -> e.stream().map(EntityBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getValueObjectList()).ifPresent(e -> e.stream().map(ValueObjectBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getCommandList()).ifPresent(e -> e.stream().map(CommandBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getEnumList()).ifPresent(e -> e.stream().map(AEnumBuilder::build).forEach(elements::add));
        ASTAggregate ASTAggregate = AggregateDslConvert.INSTANCE.dto2Do(aggregateDsl);
        ASTAggregate.addAll(elements);
        return ASTAggregate;
    }
}
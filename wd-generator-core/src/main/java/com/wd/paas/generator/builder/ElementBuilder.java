package com.wd.paas.generator.builder;

import com.wd.paas.dsl.*;
import com.wd.paas.generator.builder.convert.*;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.element.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ElementBuilder {

    public static Application build(ApplicationDsl applicationDsl) {
        Application application = ApplicationDslConvert.INSTANCE.dto2Do(applicationDsl);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(applicationDsl.getBusinessDomainList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        Optional.ofNullable(applicationDsl.getBusinessScenarioList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        application.addAll(elements);
        return application;
    }

    public static BusinessScenario build(BusinessScenarioDsl businessScenarioDsl) {
        return BusinessScenarioDslConvert.INSTANCE.dto2Do(businessScenarioDsl);
    }

    public static BusinessDomain build(BusinessDomainDsl businessDomainDsl) {
        BusinessDomain businessDomain = BusinessDomainDslConvert.INSTANCE.dto2Do(businessDomainDsl);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(businessDomainDsl.getDomainModel()).map(ElementBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getDataModel()).map(ElementBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getQueryModel()).map(ElementBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getObjectMapperModel()).map(ElementBuilder::build).ifPresent(elements::add);
        businessDomain.addAll(elements);
        return businessDomain;
    }

    private static ObjectMapperModel build(ObjectMapperModelDsl objectMapperModelDsl) {
        return null;
    }

    private static QueryModel build(QueryModelDsl queryModelDsl) {
        return null;
    }

    private static DataModel build(DataModelDsl dataModelDsl) {
        return null;
    }

    public static DomainModel build(DomainModelDsl domainModelDsl) {
        DomainModel domainModel = DomainModelDslConvert.INSTANCE.dto2Do(domainModelDsl);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(domainModelDsl.getAggregateList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        domainModel.addAll(elements);
        return domainModel;
    }

    public static Aggregate build(AggregateDsl aggregateDsl) {
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(aggregateDsl.getEntityList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getValueObjectList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getCommandList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        Optional.ofNullable(aggregateDsl.getEnumList()).ifPresent(e -> e.stream().map(ElementBuilder::build).forEach(elements::add));
        Aggregate aggregate = AggregateDslConvert.INSTANCE.dto2Do(aggregateDsl);
        aggregate.addAll(elements);
        return aggregate;
    }

    public static Entity build(EntityDsl entityDsl){
        entityDsl.getPropertyList().forEach(propertyInfo -> propertyInfo.setAccess("private"));
        return EntityDslConvert.INSTANCE.dto2Do(entityDsl);
    }

    public static ValueObject build(ValueObjectDsl valueObjectDsl) {
        return ValueObjectDslConvert.INSTANCE.dto2Do(valueObjectDsl);
    }

    public static Command build(CommandDsl commandDsl) {
        String category = commandDsl.getCategory();
        String name = commandDsl.getName();
        DomainEventDsl domainEvent = commandDsl.getDomainEvent();
        String description = commandDsl.getDescription();

        domainEvent = Optional.ofNullable(domainEvent).orElse(new DomainEventDsl());
        domainEvent.setName(name.concat(ModelUrlConstant.EVENT_CLASS_SUFFIX));
        domainEvent.setDescription(description);

        commandDsl.setCategory(StringUtils.isBlank(category) ? name : category);
        commandDsl.setName(name.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));
        Command command = CommandDslConvert.INSTANCE.dto2Do(commandDsl);

        Optional<Element> element = Optional.ofNullable(domainEvent).map(ElementBuilder::build);
        command.setDomainEvent((DomainEvent) element.orElse(new DomainEvent()));

        return command;
    }

    public static AEnum build(EnumDsl enumDsl) {
        return EnumDslConvert.INSTANCE.dto2Do(enumDsl);
    }

    public static DomainEvent build(DomainEventDsl domainEventDsl) {
        return DomainEventDslConvert.INSTANCE.dto2Do(domainEventDsl);
    }
}

package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.builder.convert.DomainEventDslConvert;
import com.wd.paas.generator.generate.element.DomainEvent;

public class DomainEventBuilder {
    public static DomainEvent build(DomainEventDsl domainEventDsl) {
        return DomainEventDslConvert.INSTANCE.dto2Do(domainEventDsl);
    }
}
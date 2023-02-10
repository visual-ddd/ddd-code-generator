package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.builder.convert.DomainEventDslConvert;
import com.wd.paas.generator.generate.element.CommandNode;
import com.wd.paas.generator.generate.element.DomainEventNode;

public class DomainEventBuilder {
    public static DomainEventNode build(DomainEventDsl domainEventDsl, CommandNode command) {
        DomainEventNode astDomainEvent = DomainEventDslConvert.INSTANCE.dto2Do(domainEventDsl);
        astDomainEvent.setParentNode(command);
        return astDomainEvent;
    }
}
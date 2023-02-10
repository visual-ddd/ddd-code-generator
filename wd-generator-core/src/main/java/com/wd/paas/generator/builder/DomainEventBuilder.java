package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.builder.convert.DomainEventDslConvert;
import com.wd.paas.generator.generate.element.ASTCommand;
import com.wd.paas.generator.generate.element.ASTDomainEvent;

public class DomainEventBuilder {
    public static ASTDomainEvent build(DomainEventDsl domainEventDsl, ASTCommand command) {
        ASTDomainEvent astDomainEvent = DomainEventDslConvert.INSTANCE.dto2Do(domainEventDsl);
        astDomainEvent.setParentNode(command);
        return astDomainEvent;
    }
}
package com.wd.paas.generator.builder;

import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.generator.builder.convert.CommandDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.CommandNode;
import com.wd.paas.generator.generate.element.DomainEventNode;
import com.wd.paas.generator.generate.element.ExternalEventNode;

import java.util.Optional;

public class CommandBuilder {
    public static CommandNode build(CommandDsl commandDsl, AggregateNode astAggregate) {
        CommandNode command = CommandDslConvert.INSTANCE.dto2Do(commandDsl);
        Optional<DomainEventNode> domainEventNode = Optional.of(commandDsl.getDomainEvent()).map(domainEventDsl -> DomainEventBuilder.build(domainEventDsl, command));
        command.setAstDomainEvent(domainEventNode.orElse(new DomainEventNode()));
        command.setExternalEventNode(new ExternalEventNode());
        command.setParentNode(astAggregate);
        return command;
    }
}
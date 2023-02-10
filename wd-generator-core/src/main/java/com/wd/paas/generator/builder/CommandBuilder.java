package com.wd.paas.generator.builder;

import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.builder.convert.CommandDslConvert;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.CommandNode;
import com.wd.paas.generator.generate.element.DomainEventNode;
import com.wd.paas.generator.generate.element.ElementNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class CommandBuilder {
    public static CommandNode build(CommandDsl commandDsl, AggregateNode astAggregate) {
        String category = commandDsl.getCategory();
        String name = commandDsl.getName();
        DomainEventDsl domainEvent = commandDsl.getDomainEvent();
        String description = commandDsl.getDescription();

        domainEvent = Optional.ofNullable(domainEvent).orElse(new DomainEventDsl());
        domainEvent.setDescription(description);

        commandDsl.setCategory(StringUtils.isBlank(category) ? name : category);
        commandDsl.setName(name.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));

        CommandNode command = CommandDslConvert.INSTANCE.dto2Do(commandDsl);
        command.setParentNode(astAggregate);
        Optional<ElementNode> element = Optional.of(domainEvent).map(domainEventDsl -> DomainEventBuilder.build(domainEventDsl, command));
        command.setAstDomainEvent((DomainEventNode) element.orElse(new DomainEventNode()));
        return command;
    }
}
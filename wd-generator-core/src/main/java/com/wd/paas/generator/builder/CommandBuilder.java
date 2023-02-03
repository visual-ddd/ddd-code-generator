package com.wd.paas.generator.builder;

import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.dsl.DomainEventDsl;
import com.wd.paas.generator.builder.convert.CommandDslConvert;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.element.ASTCommand;
import com.wd.paas.generator.generate.element.ASTDomainEvent;
import com.wd.paas.generator.generate.element.Element;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class CommandBuilder {
    public static ASTCommand build(CommandDsl commandDsl) {
        String category = commandDsl.getCategory();
        String name = commandDsl.getName();
        DomainEventDsl domainEvent = commandDsl.getDomainEvent();
        String description = commandDsl.getDescription();

        domainEvent = Optional.ofNullable(domainEvent).orElse(new DomainEventDsl());
        domainEvent.setName(name.concat(ModelUrlConstant.EVENT_CLASS_SUFFIX));
        domainEvent.setDescription(description);

        commandDsl.setCategory(StringUtils.isBlank(category) ? name : category);
        commandDsl.setName(name.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));

        Optional<Element> element = Optional.of(domainEvent).map(DomainEventBuilder::build);

        ASTCommand command = CommandDslConvert.INSTANCE.dto2Do(commandDsl);
        command.setAstDomainEvent((ASTDomainEvent) element.orElse(new ASTDomainEvent()));

        return command;
    }
}
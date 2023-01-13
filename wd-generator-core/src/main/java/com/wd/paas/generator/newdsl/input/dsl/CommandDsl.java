package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.common.ReturnInfo;
import com.wd.paas.generator.newdsl.common.RuleInfo;
import com.wd.paas.generator.newdsl.common.SourceInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.CommandDslConvert;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/***
 * @author wangchensheng
 */
@Data
public class CommandDsl implements ElementBuildable {

    private String name;

    private String description;

    private List<SourceInfo> sourceList;

    private String repository;

    private String category;

    private List<PropertyInfo> propertyList;

    private DomainEventDsl domainEvent;

    private Boolean eventEnable;

    private List<RuleInfo> ruleList;

    private ReturnInfo returnInfo;

    @Override
    public Command build() {
        Command command = CommandDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(domainEvent).map(ElementBuildable::build).ifPresent(elements::add);
        command.addAll(elements);
        return command;
    }
}

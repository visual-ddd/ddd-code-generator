package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.common.ReturnInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
import com.wd.paas.generator.newdsl.input.dsl.convert.CommandDslConvert;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class CommandDsl implements ElementBuildable {

    private String name;

    private String description;

    private List<SourceDsl> sourceList;

    private RepositoryDsl repository;

    private CommandParameterDsl commandParameter;

    private List<PropertyInfo> propertyList;

    private DomainEventDsl domainEvent;

    private Boolean eventEnable;

    private List<RuleDsl> ruleList;

    private ReturnInfo returnInfo;

    @Override
    public Command build() {
        Command command = CommandDslConvert.INSTANCE.dto2Do(this);
        return command;
    }

}

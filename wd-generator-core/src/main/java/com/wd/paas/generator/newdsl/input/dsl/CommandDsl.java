package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
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

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("sources")
    private List<SourceInfo> sourceList;

    @SerializedName("repository")
    private String repository;

    @SerializedName("category")
    private String category;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("domainEvent")
    private DomainEventDsl domainEvent;

    @SerializedName("eventEnable")
    private Boolean eventEnable;

    @SerializedName("rules")
    private List<RuleInfo> ruleList;

    @SerializedName("returnInfo")
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

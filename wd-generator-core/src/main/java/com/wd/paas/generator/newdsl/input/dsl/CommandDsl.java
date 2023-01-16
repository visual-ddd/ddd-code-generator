package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.common.ReturnInfo;
import com.wd.paas.generator.newdsl.common.RuleInfo;
import com.wd.paas.generator.newdsl.common.SourceInfo;
import com.wd.paas.generator.newdsl.constant.ModelUrlConstant;
import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
import com.wd.paas.generator.newdsl.generate.visitor.element.DomainEvent;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.CommandDslConvert;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

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
        initDomainEvent();
        this.category = buildCategory();
        this.name = buildCmdName();
        Command command = CommandDslConvert.INSTANCE.dto2Do(this);

        Optional<Element> element = Optional.ofNullable(domainEvent).map(ElementBuildable::build);
        command.setDomainEvent((DomainEvent) element.orElse(new DomainEvent()));

        return command;
    }

    private String buildCmdName() {
        return name.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX);
    }

    private void initDomainEvent() {
        domainEvent = Optional.ofNullable(domainEvent).orElse(new DomainEventDsl());
        domainEvent.setName(name.concat(ModelUrlConstant.EVENT_CLASS_SUFFIX));
        domainEvent.setDescription(description);
    }

    private String buildCategory() {
        return (StringUtils.isBlank(category) ? name : category);
    }

}

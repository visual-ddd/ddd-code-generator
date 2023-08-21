package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.common.PropertyInfo;
import com.wd.paas.common.enums.CommandSourceTypeEnum;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.common.util.TypeConvertor;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.CommandNode;
import com.wd.paas.generator.generate.element.DomainEventNode;
import com.wd.paas.generator.generate.element.ExternalEventNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/***
 * @author wangchensheng
 */
public class CommandStrategy extends AbstractElementStrategy {

    private final CommandNode astCommand;

    public CommandStrategy(CommandNode astCommand) {
        super(astCommand);
        this.astCommand = astCommand;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        initCmdName();
        astCommand.setCmdDTOName(astCommand.getCmdNoSuffixName().concat(ModelUrlConstant.DTO_SUFFIX));
        String category = astCommand.getCategory();
        astCommand.setCategory(StringUtils.isBlank(category) ? astCommand.getCmdNoSuffixName() : category);
        astCommand.getPropertyList().forEach(propertyInfo ->
                propertyInfo.setType(TypeConvertor.convertFileType(propertyInfo.getType())));

        // 指令事件
        DomainEventNode astDomainEvent = astCommand.getAstDomainEvent();
        astDomainEvent.setName(astCommand.getCmdNoSuffixName().concat(ModelUrlConstant.EVENT_CLASS_SUFFIX));
        astDomainEvent.setPropertyList(getEventProperties());
        astDomainEvent.setTitle(astCommand.getTitle());

        // 外部事件
        Object sourceValue = astCommand.getSourceValue(CommandSourceTypeEnum.EVENT.getValue());
        if (sourceValue instanceof String) {
            ExternalEventNode externalEventNode = astCommand.getExternalEventNode();
            externalEventNode.setName(initExternalEventName((String) sourceValue));
        }
    }

    private String initExternalEventName(String originalEventName) {
        String eventName = originalEventName.endsWith(ModelUrlConstant.EVENT_CLASS_SUFFIX) ? originalEventName :
                originalEventName.concat(ModelUrlConstant.EVENT_CLASS_SUFFIX);
        return CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL).convert(eventName);
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(projectTemplateType.command()));

        if (Boolean.TRUE.equals(astCommand.getEventEnable())) {
            list.addAll(Arrays.asList(projectTemplateType.event()));
        }

        switch (astCommand.getRepository()) {
            case SAVE:
                list.addAll(Arrays.asList(projectTemplateType.addCommandHandler()));
                break;
            case MODIFY:
                list.addAll(Arrays.asList(projectTemplateType.updateCommandHandler()));
                break;
            case REMOVE:
                list.addAll(Arrays.asList(projectTemplateType.deleteCommandHandler()));
                break;
        }

        Object sourceValue = astCommand.getSourceValue(CommandSourceTypeEnum.EVENT.getValue());
        if (sourceValue instanceof String) {
            list.addAll(Arrays.asList(projectTemplateType.externalEvent()));
        }

        return list;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.URL_ACTION, astCommand.getCategory().toLowerCase(Locale.ROOT));

        context.put(VelocityLabel.CMD_ID, astCommand.getIdentity());
        context.put(VelocityLabel.CMD_CLASS_NAME, astCommand.getName());
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, astCommand.getDescription());
        context.put(VelocityLabel.CMD_CLASS_TITLE, astCommand.getTitle());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, astCommand.getPropertyList());

        context.put(VelocityLabel.CMD_EVENT_ENABLE, astCommand.getEventEnable());
        context.put(VelocityLabel.CMD_EVENT_CLASS_NAME, astCommand.getAstDomainEvent().getName());
        context.put(VelocityLabel.CMD_EVENT_CLASS_FIELDS, astCommand.getAstDomainEvent().getPropertyList());
        context.put(VelocityLabel.CMD_EVENT_CLASS_DESCRIPTION, astCommand.getAstDomainEvent().getDescription());
        context.put(VelocityLabel.CMD_EVENT_CLASS_TITLE, astCommand.getAstDomainEvent().getTitle());

        context.put(VelocityLabel.EXTERNAL_EVENT_CLASS_NAME, astCommand.getExternalEventNode().getName());

        context.put(VelocityLabel.CMD_CATEGORY, astCommand.getCategory());
        context.put(VelocityLabel.CMD_DTO_CLASS, astCommand.getCmdDTOName());

        context.put(VelocityLabel.CMD_RULE_LIST, astCommand.getRuleList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        AggregateNode astAggregate = (AggregateNode) astCommand.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(astAggregate);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);
        String[] searchList = {
                // url
                ModelUrlConstant.ACTION,

                // cmd
                ModelUrlConstant.COMMAND_DTO_CLASS,
                ModelUrlConstant.COMMAND_CLASS,

                // event
                ModelUrlConstant.EVENT_CLASS,

                // externalEvent
                ModelUrlConstant.EXTERNAL_EVENT_CLASS,

                // Handler
                ModelUrlConstant.ADD_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.UPDATE_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.DELETE_COMMAND_HANDLER_CLASS
        };
        String name = astCommand.getName();
        String[] replacementList = {
                // url
                astCommand.getCategory().toLowerCase(Locale.ROOT),

                // cmd
                astCommand.getCmdDTOName(),
                name,

                // event
                astCommand.getAstDomainEvent().getName(),

                // externalEvent
                astCommand.getExternalEventNode().getName(),

                // handler
                name,
                name,
                name
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private void initCmdName() {
        String name = astCommand.getName();
        if (name.endsWith(ModelUrlConstant.COMMAND_CLASS_SUFFIX)) {
            astCommand.setName(name);
            astCommand.setCmdNoSuffixName(name.substring(0, name.lastIndexOf(ModelUrlConstant.COMMAND_CLASS_SUFFIX)));
        } else {
            astCommand.setCmdNoSuffixName(name);
            astCommand.setName(name.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));
        }
    }

    private List<PropertyInfo> getEventProperties() {
        DomainEventNode astDomainEvent = astCommand.getAstDomainEvent();
        List<PropertyInfo> eventPropertyList = astDomainEvent.getPropertyList();
        if (eventPropertyList == null || eventPropertyList.isEmpty()) {
            return astCommand.getPropertyList();
        } else {
            eventPropertyList.addAll(astCommand.getPropertyList());
            return eventPropertyList;
        }
    }
}

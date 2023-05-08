package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.common.PropertyInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.CommandNode;
import com.wd.paas.generator.generate.element.DomainEventNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.*;

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

        // 事件
        DomainEventNode astDomainEvent = astCommand.getAstDomainEvent();
        String inputEventName = astDomainEvent.getName();
        String eventName = astCommand.getCmdNoSuffixName().concat(ModelUrlConstant.EVENT_CLASS);
        astDomainEvent.setName(Optional.ofNullable(Boolean.TRUE.equals(astCommand.getEventEnable()) ? inputEventName : eventName).orElse(eventName));
        astDomainEvent.setPropertyList(getEventProperties());
        astDomainEvent.setTitle(astCommand.getTitle());
    }

    @Override
    public List<String> getTemplatePathList() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(GenerateElementTypeEnum.COMMAND.getTemplateUrls()));
        list.addAll(Arrays.asList(GenerateElementTypeEnum.EVENT.getTemplateUrls()));

        switch (astCommand.getRepository()) {
            case SAVE:
                list.addAll(Arrays.asList(GenerateElementTypeEnum.ADD_COMMAND_HANDLER.getTemplateUrls()));
                break;
            case MODIFY:
                list.addAll(Arrays.asList(GenerateElementTypeEnum.UPDATE_COMMAND_HANDLER.getTemplateUrls()));
                break;
            case REMOVE:
                list.addAll(Arrays.asList(GenerateElementTypeEnum.DELETE_COMMAND_HANDLER.getTemplateUrls()));
                break;
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

        context.put(VelocityLabel.CMD_CATEGORY, astCommand.getCategory());
        context.put(VelocityLabel.CMD_DTO_CLASS, astCommand.getCmdDTOName());

        context.put(VelocityLabel.CMD_RULE_LIST, astCommand.getRuleList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode astAggregate = (AggregateNode) astCommand.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(astAggregate);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                // url
                ModelUrlConstant.ACTION,

                // cmd
                ModelUrlConstant.COMMAND_DTO_CLASS,
                ModelUrlConstant.COMMAND_CLASS,

                // event
                ModelUrlConstant.EVENT_CLASS,

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

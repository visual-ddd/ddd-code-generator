package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.constant.ModelUrlConstant;
import com.wd.paas.generator.newdsl.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.generate.visitor.element.Command;
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

    private final Command command;

    public CommandStrategy(Command command) {
        this.command = command;
    }

    @Override
    public List<String> getTemplatePathList() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(GenerateElementTypeEnum.COMMAND.getTemplateUrls()));
        list.addAll(Arrays.asList(GenerateElementTypeEnum.EVENT.getTemplateUrls()));

        switch (command.getRepository()) {
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
        context.put(VelocityLabel.URL_ACTION, command.getCategory().toLowerCase(Locale.ROOT));

        context.put(VelocityLabel.CMD_CLASS_NAME, command.getName());
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, command.getDescription());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, command.getPropertyList());
        context.put(VelocityLabel.CMD_EVENT_CLASS_NAME, command.getDomainEvent().getName());
        context.put(VelocityLabel.CMD_CATEGORY, command.getCategory());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                // url
                ModelUrlConstant.ACTION,

                // cmd
                ModelUrlConstant.COMMAND_CLASS,

                // event
                ModelUrlConstant.EVENT_CLASS,

                // Handler
                ModelUrlConstant.ADD_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.UPDATE_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.DELETE_COMMAND_HANDLER_CLASS
        };
        String[] replacementList = {
                // url
                (String) context.get(VelocityLabel.URL_ACTION),

                // cmd
                (String) context.get(VelocityLabel.CMD_CLASS_NAME),

                // event
                (String) context.get(VelocityLabel.CMD_EVENT_CLASS_NAME),

                // handler
                (String) context.get(VelocityLabel.CMD_CLASS_NAME),
                (String) context.get(VelocityLabel.CMD_CLASS_NAME),
                (String) context.get(VelocityLabel.CMD_CLASS_NAME)

        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

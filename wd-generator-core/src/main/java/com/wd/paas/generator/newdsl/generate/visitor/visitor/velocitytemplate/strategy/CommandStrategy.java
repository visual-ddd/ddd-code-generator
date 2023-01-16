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
        context.put(VelocityLabel.CMD_CLASS_NAME, command.getName());
        context.put(VelocityLabel.CMD_INPUT_CLASS_NAME, "this.inputClassName");
        context.put(VelocityLabel.CMD_CLASS_PACKAGE, StringUtils.isBlank(command.getCategory()) ? command.getName() : command.getCategory());
        context.put(VelocityLabel.CMD_CLASS_PACKAGE_ORIGINAL, "umlClass.getOriginalClassPackage()");
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, command.getDescription());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, command.getPropertyList());
        context.put(VelocityLabel.CMD_EVENT_CLASS_NAME, command.getName().concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX).concat(ModelUrlConstant.EVENT_CLASS_SUFFIX));
        context.put(VelocityLabel.CMD_CLASS_NAME, command.getName().concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));

        context.put(VelocityLabel.URL_ACTION, command.getName().toLowerCase());
//        context.put(VelocityLabel.CMD_CLASS_METHODS, command.getMethodList());
//        context.put(VelocityLabel.CMD_EVENT, command.getDomainEvent().getName());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.COMMAND_CLASS,
                ModelUrlConstant.ADD_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.EVENT_CLASS,
                ModelUrlConstant.ACTION
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.CMD_CLASS_NAME),
                (String) context.get(VelocityLabel.CMD_CLASS_NAME),
                (String) context.get(VelocityLabel.CMD_EVENT_CLASS_NAME),

                (String) context.get(VelocityLabel.URL_ACTION)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

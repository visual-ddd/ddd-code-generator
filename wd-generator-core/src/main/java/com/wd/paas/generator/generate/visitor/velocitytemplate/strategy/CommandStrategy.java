package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.CommandNode;
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

        context.put(VelocityLabel.CMD_CLASS_NAME, astCommand.getName());
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, astCommand.getDescription());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, astCommand.getPropertyList());

        context.put(VelocityLabel.CMD_EVENT_CLASS_NAME, astCommand.getAstDomainEvent().getName());
        context.put(VelocityLabel.CMD_EVENT_CLASS_FIELDS, astCommand.getAstDomainEvent().getPropertyList());
        context.put(VelocityLabel.CMD_EVENT_CLASS_DESCRIPTION, astCommand.getAstDomainEvent().getDescription());

        context.put(VelocityLabel.CMD_CATEGORY, astCommand.getCategory());
        context.put(VelocityLabel.CMD_DTO_CLASS, astCommand.getCmdDTOName());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astCommand.getOutputPath(templateUrl, preFixOutPath);
    }
}

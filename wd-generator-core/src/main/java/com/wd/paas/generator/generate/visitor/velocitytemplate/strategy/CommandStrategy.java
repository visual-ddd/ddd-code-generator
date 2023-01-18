package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTCommand;
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

    private final ASTCommand ASTCommand;

    public CommandStrategy(ASTCommand ASTCommand) {
        this.ASTCommand = ASTCommand;
    }

    @Override
    public List<String> getTemplatePathList() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(GenerateElementTypeEnum.COMMAND.getTemplateUrls()));
        list.addAll(Arrays.asList(GenerateElementTypeEnum.EVENT.getTemplateUrls()));

        switch (ASTCommand.getRepository()) {
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
        context.put(VelocityLabel.URL_ACTION, ASTCommand.getCategory().toLowerCase(Locale.ROOT));

        context.put(VelocityLabel.CMD_CLASS_NAME, ASTCommand.getName());
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, ASTCommand.getDescription());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, ASTCommand.getPropertyList());
        context.put(VelocityLabel.CMD_EVENT_CLASS_NAME, ASTCommand.getASTDomainEvent().getName());
        context.put(VelocityLabel.CMD_CATEGORY, ASTCommand.getCategory());
        context.put(VelocityLabel.CMD_DTO_CLASS, ASTCommand.getCategory().concat(VelocityLabel.CLASS_DTO_SUFFIX));
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

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
        String[] replacementList = {
                // url
                (String) context.get(VelocityLabel.URL_ACTION),

                // cmd
                (String) context.get(VelocityLabel.CMD_DTO_CLASS),
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

package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd;

import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.CmdTypeEnum;
import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.handler.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 指令生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmdGenerator extends AbstractGenerator {

    /**
     * 类信息
     */
    private UmlClass umlClass;
    /**
     * 输入的类名
     */
    private String inputClassName;
    /**
     * 指令事件
     */
    private CmdEventGenerator cmdEventGenerator;
    /**
     * 指令操作类型
     */
    private CmdTypeEnum cmdType;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
        if (cmdEventGenerator != null) {
            cmdEventGenerator.run(generateContext);
        }
        getCmdHandlerGenerator().run(generateContext);
    }

    private CmdHandlerGenerator getCmdHandlerGenerator() {
        CmdHandlerGenerator cmdHandlerGenerator;
        switch (cmdType) {
            case ADD:
                cmdHandlerGenerator = new AddCmdHandlerGenerator();
                break;
            case UPDATE:
                cmdHandlerGenerator = new UpdateCmdHandlerGenerator();
                break;
            case DELETE:
                cmdHandlerGenerator = new DeleteCmdHandlerGenerator();
                break;
            case DEFAULT:
            default:
                cmdHandlerGenerator = new DefaultCmdHandlerGenerator();
                break;
        }
        return cmdHandlerGenerator;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.CMD_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.CMD_INPUT_CLASS_NAME, this.inputClassName);
        context.put(VelocityLabel.CMD_CLASS_PACKAGE, umlClass.getClassPackage());
        context.put(VelocityLabel.CMD_CLASS_PACKAGE_ORIGINAL, umlClass.getOriginalClassPackage());
        context.put(VelocityLabel.CMD_CLASS_DESCRIPTION, umlClass.getClassDesc());
        context.put(VelocityLabel.CMD_CLASS_FIELDS, umlClass.getFieldList());
        context.put(VelocityLabel.CMD_CLASS_METHODS, umlClass.getMethodList());
        context.put(VelocityLabel.CMD_EVENT, cmdEventGenerator);
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.COMMAND;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
                .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER))
                .replace(ModelUrlConstant.ACTION, ((String) context.get(VelocityLabel.CMD_CLASS_PACKAGE)))
                .replace(ModelUrlConstant.COMMAND_DTO_CLASS, this.inputClassName + "DTO")
                .replace(ModelUrlConstant.COMMAND_CLASS, umlClass.getClassName());
    }
}

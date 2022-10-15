package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
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
     * 指令事件
     */
    private CmdEventGenerator cmdEventGenerator;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
        cmdEventGenerator.generate(generateContext);
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        umlClass.putVelocityContext(context);
        context.put(VelocityLabel.CMD_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.CMD_FIELD_LIST, umlClass.getFieldList());
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
                .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_ALL_LOWER_NAME))
                .replace(ModelUrlConstant.ACTION, (String) context.get(VelocityLabel.CLASS_PACKAGE))
                .replace(ModelUrlConstant.COMMAND_CLASS, umlClass.getClassName());
    }
}

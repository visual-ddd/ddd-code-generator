package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd.handler;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 删除指令处理器生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeleteCmdHandlerGenerator extends CmdHandlerGenerator {

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.DELETE_COMMAND_HANDLER;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
            .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
            .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER))
            .replace(ModelUrlConstant.ACTION, ((String) context.get(VelocityLabel.CMD_CLASS_PACKAGE)))
            .replace(ModelUrlConstant.DELETE_COMMAND_HANDLER_CLASS, ((String) context.get(VelocityLabel.CMD_CLASS_NAME)));
    }
}

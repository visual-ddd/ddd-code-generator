package com.wd.paas.generator.generate.generator.project.domainchart.aggregation.cmd;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 指令事件生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmdEventGenerator extends AbstractGenerator {

    /**
     * 类信息
     */
    private UmlClass umlClass;

    @Override
    public void putVelocityContext(VelocityContext context) {
        umlClass.putVelocityContext(context);
    }

    @Override
    public String[] getElementTypeUrl() {
        return GenerateElementTypeEnum.EVENT.getTemplateUrls();
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
                .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_ALL_LOWER_NAME))
                .replace(ModelUrlConstant.ACTION, ((String) context.get(VelocityLabel.CLASS_PACKAGE)))
                .replace(ModelUrlConstant.EVENT_CLASS, umlClass.getClassName());
    }
}

package com.wd.paas.generator.generate.generator.project.domainchart.aggregation;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

/**
 * 实体生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/9/20 15:14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EntityGenerator extends AbstractGenerator {

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
        return GenerateElementTypeEnum.ENTITY.getTemplateUrls();
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
                .replace(ModelUrlConstant.AGGREGATION, (String) context.get(VelocityLabel.AGGREGATION_ALL_LOWER_NAME))
                .replace(ModelUrlConstant.ENTITY_CLASS, umlClass.getClassName());
    }
}

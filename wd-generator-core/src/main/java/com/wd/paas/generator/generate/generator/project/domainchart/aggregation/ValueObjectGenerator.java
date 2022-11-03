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
 * 值对象生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ValueObjectGenerator extends AbstractGenerator {

    /**
     * 类信息
     */
    private UmlClass umlClass;

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_NAME, umlClass.getClassName());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_PACKAGE, umlClass.getClassPackage());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_DESCRIPTION, umlClass.getClassDesc());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_FIELDS, umlClass.getFieldList());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_METHODS, umlClass.getMethodList());
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.VALUE_OBJECT;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, (String) context.get(VelocityLabel.DOMAIN_NAME))
                .replace(ModelUrlConstant.AGGREGATION,
                        (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER))
                .replace(ModelUrlConstant.VALUE_OBJECT_CLASS, umlClass.getClassName());
    }
}

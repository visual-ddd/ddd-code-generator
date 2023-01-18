package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTValueObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class ValueObjectStrategy extends AbstractElementStrategy {

    private final ASTValueObject ASTValueObject;

    public ValueObjectStrategy(ASTValueObject ASTValueObject) {
        this.ASTValueObject = ASTValueObject;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.VALUE_OBJECT.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_NAME, ASTValueObject.getName());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_DESCRIPTION, ASTValueObject.getDescription());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_FIELDS, ASTValueObject.getPropertyList());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_METHODS, ASTValueObject.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.VALUE_OBJECT_CLASS
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.VALUE_OBJECT_CLASS_NAME)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

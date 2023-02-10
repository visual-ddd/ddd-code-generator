package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ValueObjectNode;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class ValueObjectStrategy extends AbstractElementStrategy {

    private final ValueObjectNode astValueObject;

    public ValueObjectStrategy(ValueObjectNode ASTValueObject) {
        this.astValueObject = ASTValueObject;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.VALUE_OBJECT.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_NAME, astValueObject.getName());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_DESCRIPTION, astValueObject.getDescription());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_FIELDS, astValueObject.getPropertyList());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_METHODS, astValueObject.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astValueObject.getOutputPath(templateUrl, preFixOutPath);
    }
}

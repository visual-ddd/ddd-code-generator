package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.generate.visitor.element.ValueObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class ValueObjectStrategy extends AbstractElementStrategy {

    private ValueObject valueObject;

    public ValueObjectStrategy(ValueObject valueObject){
        this.valueObject = valueObject;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.VALUE_OBJECT.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_NAME, valueObject.getName());
//        context.put(VelocityLabel.VALUE_OBJECT_CLASS_PACKAGE, valueObject.getClassPackage());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_DESCRIPTION, valueObject.getDescription());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_FIELDS, valueObject.getPropertyList());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_METHODS, valueObject.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {

        String[] searchList = {
                ModelUrlConstant.OUTPUT_PATH,
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.FIELD,
                ModelUrlConstant.AGGREGATION,
                ModelUrlConstant.VALUE_OBJECT_CLASS,
                ModelUrlConstant.VM
        };
        String[] replacementList = {
                preFixOutPath,
                (String) context.get(VelocityLabel.PROJECT_NAME),
                (String) context.get(VelocityLabel.PROJECT_SLASH_GROUP),
                (String) context.get(VelocityLabel.DOMAIN_NAME),
                (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME),
                (String) context.get(VelocityLabel.VALUE_OBJECT_CLASS_NAME),
                ModelUrlConstant.EMPTY
        };
        return StringUtils.replaceEach(templateUrl, searchList, replacementList);
    }
}

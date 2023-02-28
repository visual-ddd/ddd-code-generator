package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.ValueObjectNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class ValueObjectStrategy extends AbstractElementStrategy {

    private final ValueObjectNode astValueObject;

    public ValueObjectStrategy(ValueObjectNode valueObjectNode) {
        super(valueObjectNode);
        this.astValueObject = valueObjectNode;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        astValueObject.setValueObjectDTOName(getValueObjectDTOName());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.VALUE_OBJECT.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.VALUE_OBJECT_ID, astValueObject.getIdentity());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_NAME, astValueObject.getName());
        context.put(VelocityLabel.VALUE_OBJECT_DTO_NAME, astValueObject.getValueObjectDTOName());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_DESCRIPTION, astValueObject.getDescription());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_FIELDS, astValueObject.getPropertyList());
        context.put(VelocityLabel.VALUE_OBJECT_CLASS_METHODS, astValueObject.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode astAggregate = (AggregateNode) astValueObject.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(astAggregate);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.VALUE_OBJECT_DTO_CLASS,
                ModelUrlConstant.VALUE_OBJECT_CLASS
        };
        String[] replacementList = {
                astValueObject.getValueObjectDTOName(),
                astValueObject.getName()
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String getValueObjectDTOName() {
        return astValueObject.getName().concat(ModelUrlConstant.REQUEST_SUFFIX);
    }
}

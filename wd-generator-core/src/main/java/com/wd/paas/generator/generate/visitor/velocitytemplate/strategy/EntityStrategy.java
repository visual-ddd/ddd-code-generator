package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EntityStrategy extends AbstractElementStrategy{

    private final ASTEntity ASTEntity;

    public EntityStrategy(ASTEntity ASTEntity) {
        this.ASTEntity = ASTEntity;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.ENTITY.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENTITY_CLASS_NAME, ASTEntity.getName());
        context.put(VelocityLabel.ENTITY_CLASS_DESCRIPTION, ASTEntity.getDescription());
        context.put(VelocityLabel.ENTITY_CLASS_FIELDS, ASTEntity.getPropertyList());
        context.put(VelocityLabel.ENTITY_CLASS_METHODS, ASTEntity.getMethodInfoList());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = AggregationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.ENTITY_CLASS
        };

        String[] replacementList = {
                (String) context.get(VelocityLabel.ENTITY_CLASS_NAME)
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

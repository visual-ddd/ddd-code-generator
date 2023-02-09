package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTEntity;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EntityStrategy extends AbstractElementStrategy{

    private final ASTEntity astEntity;

    public EntityStrategy(ASTEntity ASTEntity) {
        this.astEntity = ASTEntity;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.ENTITY.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENTITY_CLASS_NAME, astEntity.getName());
        context.put(VelocityLabel.ENTITY_CLASS_DESCRIPTION, astEntity.getDescription());
        context.put(VelocityLabel.ENTITY_CLASS_FIELDS, astEntity.getPropertyList());
        context.put(VelocityLabel.ENTITY_CLASS_METHODS, astEntity.getMethodInfoList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astEntity.getOutputPath(templateUrl, preFixOutPath);
    }

}

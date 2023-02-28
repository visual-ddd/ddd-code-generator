package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EntityNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/***
 * @author wangchensheng
 */
public class EntityStrategy extends AbstractElementStrategy{

    private final EntityNode astEntity;

    public EntityStrategy(EntityNode entityNode) {
        super(entityNode);
        this.astEntity = entityNode;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        astEntity.setEntityDTOName(getEntityDTOName());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.ENTITY.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENTITY_ID, astEntity.getIdentity());
        context.put(VelocityLabel.ENTITY_CLASS_NAME, astEntity.getName());
        context.put(VelocityLabel.ENTITY_DTO_CLASS_NAME, astEntity.getEntityDTOName());
        context.put(VelocityLabel.ENTITY_CLASS_DESCRIPTION, astEntity.getDescription());
        context.put(VelocityLabel.ENTITY_CLASS_ID, astEntity.getId());
        context.put(VelocityLabel.ENTITY_CLASS_FIELDS, astEntity.getPropertyList());
        context.put(VelocityLabel.ENTITY_CLASS_METHODS, astEntity.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode parentNode = (AggregateNode) astEntity.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(parentNode);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.ENTITY_DTO_CLASS,
                ModelUrlConstant.ENTITY_CLASS
        };

        String[] replacementList = {
                astEntity.getEntityDTOName(),
                astEntity.getName()
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String getEntityDTOName() {
        return astEntity.getName().concat(ModelUrlConstant.REQUEST_SUFFIX);
    }

}

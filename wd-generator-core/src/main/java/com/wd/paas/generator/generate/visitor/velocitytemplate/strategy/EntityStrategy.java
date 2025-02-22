package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.common.util.TypeConvertor;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EntityNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        astEntity.getPropertyList().forEach(propertyInfo ->
                propertyInfo.setType(TypeConvertor.convertFileType(propertyInfo.getType())));
    }

    @Override
    public Set<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return new HashSet<>(Arrays.asList(projectTemplateType.entity()));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.ENTITY_ID, astEntity.getIdentity());
        context.put(VelocityLabel.ENTITY_CLASS_NAME, astEntity.getName());
        context.put(VelocityLabel.ENTITY_DTO_CLASS_NAME, astEntity.getEntityDTOName());
        context.put(VelocityLabel.ENTITY_CLASS_DESCRIPTION, astEntity.getDescription());
        context.put(VelocityLabel.ENTITY_CLASS_TITLE, astEntity.getTitle());
        context.put(VelocityLabel.ENTITY_CLASS_ID, astEntity.getId());
        context.put(VelocityLabel.ENTITY_CLASS_FIELDS, astEntity.getPropertyList());
        context.put(VelocityLabel.ENTITY_CLASS_METHODS, astEntity.getMethodList());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        AggregateNode parentNode = (AggregateNode) astEntity.getParentNode();
        AggregationStrategy aggregationStrategy = new AggregationStrategy(parentNode);
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);

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

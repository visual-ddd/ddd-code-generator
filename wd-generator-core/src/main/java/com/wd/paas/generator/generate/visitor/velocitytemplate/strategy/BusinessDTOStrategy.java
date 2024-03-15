package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.common.util.TypeConvertor;
import com.wd.paas.generator.generate.element.BusinessDTONode;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BusinessDTOStrategy extends AbstractElementStrategy {

    private final BusinessDTONode node;

    public BusinessDTOStrategy(BusinessDTONode astDto) {
        super(astDto);
        this.node = astDto;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        initName(node);
        node.getPropertyList().forEach(propertyInfo ->
                propertyInfo.setType(TypeConvertor.convertFileType(propertyInfo.getType())));
    }

    @Override
    public Set<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return new HashSet<>(Arrays.asList(projectTemplateType.businessDto()));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.BUSINESS_DTO_ID, node.getIdentity());
        context.put(VelocityLabel.BUSINESS_DTO_CLASS_NAME, node.getName());
        context.put(VelocityLabel.BUSINESS_DTO_CLASS_FIELDS, node.getPropertyList());
        context.put(VelocityLabel.BUSINESS_DTO_CLASS_DESCRIPTION, node.getDescription());
        context.put(VelocityLabel.BUSINESS_DTO_CLASS_TITLE, node.getTitle());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        BusinessServiceModelNode serviceModelNode = (BusinessServiceModelNode) node.getParentNode();
        BusinessScenarioNode businessScenarioNode = (BusinessScenarioNode) serviceModelNode.getParentNode();
        BusinessScenarioStrategy businessScenarioStrategy = new BusinessScenarioStrategy(businessScenarioNode);

        String outputPath = businessScenarioStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);
        String[] searchList = {
                ModelUrlConstant.BUSINESS_DTO_CLASS
        };

        String[] replacementList = {
                node.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private void initName(BusinessDTONode businessDTONode) {
        String name = businessDTONode.getName();
        if (name.endsWith(ModelUrlConstant.DTO_SUFFIX)) {
            businessDTONode.setName(name);
            businessDTONode.setDtoNoSuffixName(name.substring(0, name.lastIndexOf(ModelUrlConstant.DTO_SUFFIX)));
        } else {
            businessDTONode.setDtoNoSuffixName(name);
            businessDTONode.setName(name.concat(ModelUrlConstant.DTO_SUFFIX));
        }
    }
}

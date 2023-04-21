package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.BusinessQueryNode;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class BusinessQueryStrategy extends AbstractElementStrategy {

    private final BusinessQueryNode node;

    public BusinessQueryStrategy(BusinessQueryNode businessQueryNode) {
        super(businessQueryNode);
        this.node = businessQueryNode;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.BUSINESS_QUERY.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.BUSINESS_QUERY_ID, node.getIdentity());
        context.put(VelocityLabel.BUSINESS_QUERY_CLASS_NAME, node.getName());
        context.put(VelocityLabel.BUSINESS_QUERY_CLASS_DESCRIPTION, node.getDescription());
        context.put(VelocityLabel.BUSINESS_QUERY_CLASS_TITLE, node.getTitle());
        context.put(VelocityLabel.BUSINESS_QUERY_CLASS_FIELDS, node.getPropertyList());
        context.put(VelocityLabel.BUSINESS_QUERY_PAGINATION, node.getPagination());
        context.put(VelocityLabel.BUSINESS_QUERY_RETURN_INFO, node.getReturnInfo());
        context.put(VelocityLabel.BUSINESS_QUERY_RETURN_TYPE, node.getReturnInfo().getType());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        BusinessServiceModelNode serviceModelNode = (BusinessServiceModelNode) node.getParentNode();
        BusinessScenarioNode businessScenarioNode = (BusinessScenarioNode) serviceModelNode.getParentNode();
        BusinessScenarioStrategy businessScenarioStrategy = new BusinessScenarioStrategy(businessScenarioNode);

        String outputPath = businessScenarioStrategy.parseOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.BUSINESS_QUERY_CLASS,
        };
        String[] replacementList = {
                node.getName(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.generate.element.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shimmer
 */
public class BusinessScenarioStrategy extends AbstractElementStrategy {

    private final BusinessScenarioNode node;

    public BusinessScenarioStrategy(BusinessScenarioNode aSTBusinessDomain) {
        super(aSTBusinessDomain);
        this.node = aSTBusinessDomain;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        String name = node.getName();
        node.setName(CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL).convert(name));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.BUSINESS_ID, node.getIdentity());
        context.put(VelocityLabel.BUSINESS_NAME, node.getName());
        context.put(VelocityLabel.BUSINESS_CLASS_NAME, node.getName());
        context.put(VelocityLabel.BUSINESS_DESCRIPTION, node.getDescription());
        context.put(VelocityLabel.BUSINESS_TITLE, node.getTitle());
        context.put(VelocityLabel.BUSINESS_AUTHOR, "visual-ddd");
        context.put(VelocityLabel.BUSINESS_QUERY_LIST, getQueryList());
        context.put(VelocityLabel.BUSINESS_DTO_LIST, getDTOList());
    }

    @Override
    public Set<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return new HashSet<>(Arrays.asList(projectTemplateType.businessScenario()));
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        ApplicationStrategy applicationStrategy = new ApplicationStrategy((ApplicationNode) node.getParentNode());
        String outputPath = applicationStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);
        String[] searchList = {
                ModelUrlConstant.BUSINESS,
                ModelUrlConstant.BUSINESS_SERVICE_CLASS,
        };
        String[] replacementList = {
                node.getName().toLowerCase(),
                node.getName(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private List<BusinessQueryNode> getQueryList() {
        BusinessServiceModelNode queryModel = node.getChildElementList(BusinessServiceModelNode.class).get(0);
        return queryModel.getChildElementList(BusinessQueryNode.class);
    }

    private List<BusinessDTONode> getDTOList() {
        BusinessServiceModelNode queryModel = node.getChildElementList(BusinessServiceModelNode.class).get(0);
        return queryModel.getChildElementList(BusinessDTONode.class);
    }
}

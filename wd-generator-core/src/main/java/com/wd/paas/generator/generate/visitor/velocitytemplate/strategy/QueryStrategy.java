package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.QueryModelNode;
import com.wd.paas.generator.generate.element.QueryNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class QueryStrategy extends AbstractElementStrategy {

    private final QueryNode query;

    public QueryStrategy(QueryNode astQuery) {
        super(astQuery);
        this.query = astQuery;
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.QUERY.getTemplateUrls());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.QUERY_ID, query.getIdentity());
        context.put(VelocityLabel.QUERY_CLASS_NAME, query.getName());
        context.put(VelocityLabel.QUERY_CLASS_DESCRIPTION, query.getDescription());
        context.put(VelocityLabel.QUERY_CLASS_FIELDS, query.getPropertyList());
        context.put(VelocityLabel.QUERY_PAGINATION, query.getPagination());
        context.put(VelocityLabel.QUERY_RETURN_INFO, query.getReturnInfo());
        context.put(VelocityLabel.QUERY_RETURN_TYPE, query.getReturnInfo().getType());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        QueryModelNode queryModel = (QueryModelNode) query.getParentNode();
        BusinessDomainNode astBusinessDomain = (BusinessDomainNode) queryModel.getParentNode();
        BusinessDomainStrategy businessDomainStrategy = new BusinessDomainStrategy(astBusinessDomain);

        String outputPath = businessDomainStrategy.parseOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.QUERY_CLASS,
        };
        String[] replacementList = {
                query.getName(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

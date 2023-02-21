package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.QueryNode;
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
        context.put(VelocityLabel.QUERY_CLASS_NAME, query.getName());
        context.put(VelocityLabel.QUERY_CLASS_DESCRIPTION, query.getDescription());
        context.put(VelocityLabel.QUERY_CLASS_FIELDS, query.getPropertyList());
        context.put(VelocityLabel.QUERY_PAGINATION, query.getPagination());
        context.put(VelocityLabel.QUERY_RETURN_INFO, query.getReturnInfo());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return query.getOutputPath(templateUrl, preFixOutPath);
    }
}

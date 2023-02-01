package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.ASTQuery;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

public class QueryStrategy extends AbstractElementStrategy {

    private final ASTQuery query;

    public QueryStrategy(ASTQuery astQuery) {
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
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = BusinessDomainStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.QUERY_CLASS,
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.QUERY_CLASS_NAME),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}

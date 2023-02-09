package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shimmer
 */
public class BusinessDomainStrategy extends AbstractElementStrategy {

    private final ASTBusinessDomain astBusinessDomain;

    public BusinessDomainStrategy(ASTBusinessDomain aSTBusinessDomain) {
        this.astBusinessDomain = aSTBusinessDomain;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        String domainName = astBusinessDomain.getName();

        context.put(VelocityLabel.DOMAIN_NAME, domainName);
        context.put(VelocityLabel.DOMAIN_CLASS_NAME, convertDomainClassName(domainName));
        context.put(VelocityLabel.DOMAIN_URL_NAME, convertFieldUrl(domainName));
        context.put(VelocityLabel.DOMAIN_AUTHOR, "WCS \n * @author ZXL");
        context.put(VelocityLabel.DOMAIN_DESCRIPTION, astBusinessDomain.getDescription());

        context.put(VelocityLabel.DOMAIN_QUERY_LIST, getQueryList());
        context.put(VelocityLabel.DOMAIN_CMD_LIST, getCmdList());
        context.put(VelocityLabel.DOMAIN_DATA_LIST, getDataList());
        context.put(VelocityLabel.DOMAIN_AGGREGATION_LIST, getAggregationList());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.DOMAIN_CHART.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return getOutputPath(templateUrl, context, preFixOutPath);
    }

    protected static String getOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = ApplicationStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.FIELD,
                ModelUrlConstant.DOMAIN_CLASS,
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.DOMAIN_URL_NAME),
                (String) context.get(VelocityLabel.DOMAIN_CLASS_NAME),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    /**
     * 实现领域类名转换规则
     */
    private static String convertDomainClassName(String domainName) {
        return CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL).convert(domainName);
    }

    /**
     * 实现领域路径转换规则
     */
    private static String convertFieldUrl(String domainName) {
        return domainName.toLowerCase();
    }

    private List<ASTAggregate> getAggregationList() {
        ASTDomainModel domainModel = astBusinessDomain.getChildElementList(ASTDomainModel.class).get(0);
        return domainModel.getChildElementList(ASTAggregate.class);
    }

    private List<ElementNode> getCmdList() {
        ASTDomainModel domainModel = astBusinessDomain.getChildElementList(ASTDomainModel.class).get(0);
        List<ASTAggregate> aggregationList = domainModel.getChildElementList(ASTAggregate.class);
        return aggregationList.stream()
                .map(aggregate -> aggregate.getChildElementList(ASTCommand.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<ASTQuery> getQueryList() {
        ASTQueryModel queryModel = astBusinessDomain.getChildElementList(ASTQueryModel.class).get(0);
        return queryModel.getChildElementList(ASTQuery.class);
    }

    private List<ASTDataObject> getDataList() {
        ASTDataModel astDataModel = astBusinessDomain.getChildElementList(ASTDataModel.class).get(0);
        return astDataModel.getChildElementList(ASTDataObject.class);
    }
}

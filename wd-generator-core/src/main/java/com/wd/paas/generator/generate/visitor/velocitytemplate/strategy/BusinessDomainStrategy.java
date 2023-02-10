package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
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

    private final BusinessDomainNode astBusinessDomain;

    public BusinessDomainStrategy(BusinessDomainNode aSTBusinessDomain) {
        this.astBusinessDomain = aSTBusinessDomain;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        String domainName = astBusinessDomain.getName();

        context.put(VelocityLabel.DOMAIN_NAME, domainName);
        context.put(VelocityLabel.DOMAIN_CLASS_NAME, astBusinessDomain.convertDomainClassName());
        context.put(VelocityLabel.DOMAIN_AUTHOR, "WCS \n * @author ZXL");
        context.put(VelocityLabel.DOMAIN_DESCRIPTION, astBusinessDomain.getDescription());

        context.put(VelocityLabel.DOMAIN_QUERY_LIST, getQueryList());
        context.put(VelocityLabel.DOMAIN_DTO_LIST, getDTOList());
        context.put(VelocityLabel.DOMAIN_CMD_LIST, getCmdList());
        context.put(VelocityLabel.DOMAIN_DATA_LIST, getDataList());
        context.put(VelocityLabel.DOMAIN_AGGREGATION_LIST, getAggregationList());
        context.put(VelocityLabel.DOMAIN_OBJECT_MAPPER_LIST, getObjectMapperList());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.DOMAIN_CHART.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astBusinessDomain.getOutputPath(templateUrl, preFixOutPath);
    }

    private List<AggregateNode> getAggregationList() {
        DomainModelNode domainModel = astBusinessDomain.getChildElementList(DomainModelNode.class).get(0);
        return domainModel.getChildElementList(AggregateNode.class);
    }

    private List<ElementNode> getCmdList() {
        DomainModelNode domainModel = astBusinessDomain.getChildElementList(DomainModelNode.class).get(0);
        List<AggregateNode> aggregationList = domainModel.getChildElementList(AggregateNode.class);
        return aggregationList.stream()
                .map(aggregate -> aggregate.getChildElementList(CommandNode.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<QueryNode> getQueryList() {
        QueryModelNode queryModel = astBusinessDomain.getChildElementList(QueryModelNode.class).get(0);
        return queryModel.getChildElementList(QueryNode.class);
    }

    private List<DtoNode> getDTOList() {
        QueryModelNode queryModel = astBusinessDomain.getChildElementList(QueryModelNode.class).get(0);
        return queryModel.getChildElementList(DtoNode.class);
    }

    private List<DataObjectNode> getDataList() {
        DataModelNode astDataModel = astBusinessDomain.getChildElementList(DataModelNode.class).get(0);
        return astDataModel.getChildElementList(DataObjectNode.class);
    }

    private List<ObjectMapperNode> getObjectMapperList() {
        ObjectMapperModelNode objectMapperModel = astBusinessDomain.getChildElementList(ObjectMapperModelNode.class).get(0);
        return objectMapperModel.getChildElementList(ObjectMapperNode.class);
    }
}

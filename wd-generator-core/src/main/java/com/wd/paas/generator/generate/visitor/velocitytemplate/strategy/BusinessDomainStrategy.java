package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
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

    private final BusinessDomainNode astBusinessDomain;

    public BusinessDomainStrategy(BusinessDomainNode astBusinessDomain) {
        super(astBusinessDomain);
        this.astBusinessDomain = astBusinessDomain;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        String name = astBusinessDomain.getName();
        astBusinessDomain.setName(CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.UPPER_CAMEL).convert(name));
        astBusinessDomain.setDomainAllLowerName(name.toLowerCase());
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DOMAIN_ID, astBusinessDomain.getIdentity());
        context.put(VelocityLabel.DOMAIN_NAME, astBusinessDomain.getName());
        context.put(VelocityLabel.DOMAIN_CLASS_NAME, astBusinessDomain.getName());
        context.put(VelocityLabel.DOMAIN_AUTHOR, "visual-ddd");
        context.put(VelocityLabel.DOMAIN_TITLE, astBusinessDomain.getTitle());
        context.put(VelocityLabel.DOMAIN_DESCRIPTION, astBusinessDomain.getDescription());

        context.put(VelocityLabel.DOMAIN_QUERY_LIST, getQueryList());
        context.put(VelocityLabel.DOMAIN_DTO_LIST, getDTOList());
        context.put(VelocityLabel.DOMAIN_CMD_LIST, getCmdList());
        context.put(VelocityLabel.DOMAIN_ENUM_LIST, getEnumList());
        context.put(VelocityLabel.DOMAIN_VALUE_OBJECT_LIST, getValueObjectList());
        context.put(VelocityLabel.DOMAIN_ENTITY_LIST, getEntityList());
        context.put(VelocityLabel.DOMAIN_DATA_LIST, getDataList());
        context.put(VelocityLabel.DOMAIN_AGGREGATION_LIST, getAggregationList());
        context.put(VelocityLabel.DOMAIN_OBJECT_MAPPER_LIST, getObjectMapperList());
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        List<String> domainChartTemplateList = new ArrayList<>();
        domainChartTemplateList.addAll(Arrays.asList(projectTemplateType.domainChart()));
        domainChartTemplateList.addAll(Arrays.asList(projectTemplateType.domainChartTask()));
        domainChartTemplateList.addAll(Arrays.asList(projectTemplateType.domainChartListener()));
        return domainChartTemplateList;
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        ApplicationStrategy applicationStrategy = new ApplicationStrategy((ApplicationNode) astBusinessDomain.getParentNode());
        String outputPath = applicationStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);
        String[] searchList = {
                ModelUrlConstant.FIELD,
                ModelUrlConstant.DOMAIN_CLASS,
        };
        String[] replacementList = {
                astBusinessDomain.getDomainAllLowerName(),
                astBusinessDomain.getName(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    private List<AggregateNode> getAggregationList() {
        DomainModelNode domainModel = astBusinessDomain.getChildElementList(DomainModelNode.class).get(0);
        return domainModel.getChildElementList(AggregateNode.class);
    }

    private List<EnumNode> getEnumList() {
        List<AggregateNode> aggregationList = getAggregationList();
        return aggregationList.stream()
                .map(aggregate -> aggregate.getChildElementList(EnumNode.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<ValueObjectNode> getValueObjectList() {
        List<AggregateNode> aggregationList = getAggregationList();
        return aggregationList.stream()
                .map(aggregate -> aggregate.getChildElementList(ValueObjectNode.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<EntityNode> getEntityList() {
        List<AggregateNode> aggregationList = getAggregationList();
        return aggregationList.stream()
                .map(aggregate -> aggregate.getChildElementList(EntityNode.class))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<CommandNode> getCmdList() {
        List<AggregateNode> aggregationList = getAggregationList();
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

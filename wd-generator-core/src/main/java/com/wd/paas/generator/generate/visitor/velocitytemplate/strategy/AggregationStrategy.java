package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.generate.element.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class AggregationStrategy extends AbstractElementStrategy {

    private final AggregateNode astAggregate;

    public AggregationStrategy(AggregateNode astAggregate) {
        super(astAggregate);
        this.astAggregate = astAggregate;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, astAggregate.getChildElementList(EnumNode.class));
        context.put(VelocityLabel.AGGREGATION_VALUE_OBJECT_LIST, astAggregate.getChildElementList(ValueObjectNode.class));
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, astAggregate.getChildElementList(CommandNode.class));
        context.put(VelocityLabel.AGGREGATION_ENTITY_LIST, astAggregate.getChildElementList(EntityNode.class));

        context.put(VelocityLabel.URL_AGGREGATION, astAggregate.getName().toLowerCase());
    }

    @Override
    public List<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return Arrays.asList(projectTemplateType.aggregationRoot());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        DomainModelNode domainModel = (DomainModelNode) astAggregate.getParentNode();
        BusinessDomainStrategy businessDomainStrategy = new BusinessDomainStrategy((BusinessDomainNode) domainModel.getParentNode());
        String outputPath = businessDomainStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.AGGREGATION,
        };
        String[] replacementList = {
                astAggregate.getName().toLowerCase(),
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

}

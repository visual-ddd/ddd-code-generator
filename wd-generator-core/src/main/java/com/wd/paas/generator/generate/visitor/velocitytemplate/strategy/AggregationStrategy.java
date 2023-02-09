package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author shimmer
 */
public class AggregationStrategy extends AbstractElementStrategy {

    private final ASTAggregate astAggregate;

    public AggregationStrategy(ASTAggregate astAggregate) {
        this.astAggregate = astAggregate;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        ASTAggregateRoot astAggregateRoot = Optional.of(astAggregate.getRoot()).orElse(new ASTAggregateRoot());
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, astAggregateRoot.getName());
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, astAggregateRoot.getDescription());
        context.put(VelocityLabel.AGGREGATION_CLASS_ID, astAggregateRoot.getId());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, astAggregateRoot.getPropertyList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, astAggregateRoot.getMethodList());

        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, astAggregate.getChildElementList(ASTEnum.class));
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, astAggregate.getChildElementList(ASTCommand.class));
        context.put(VelocityLabel.AGGREGATION_ENTITY_LIST, astAggregate.getChildElementList(ASTEntity.class));

        context.put(VelocityLabel.URL_AGGREGATION, astAggregateRoot.getName().toLowerCase());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.AGGREGATION.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        return astAggregate.getOutputPath(templateUrl, preFixOutPath);
    }

}

package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.builder.context.ImportPathContextHelper;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
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
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return getOutputPath(templateUrl, context, preFixOutPath);
    }

    protected static String getOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String outputPath = BusinessDomainStrategy.getOutputPath(templateUrl, context, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.AGGREGATION,
                ModelUrlConstant.AGGREGATION_CLASS
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.URL_AGGREGATION),
                (String) context.get(VelocityLabel.AGGREGATION_CLASS_NAME)
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

}

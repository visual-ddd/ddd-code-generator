package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shimmer
 */
public class AggregationStrategy extends AbstractElementStrategy {

    private final ASTAggregate ASTAggregate;

    public AggregationStrategy(ASTAggregate ASTAggregate) {
        this.ASTAggregate = ASTAggregate;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        ASTAggregateRoot ASTAggregateRoot = Optional.of(ASTAggregate.getRoot()).orElse(new ASTAggregateRoot());
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, ASTAggregateRoot.getName());
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, ASTAggregateRoot.getDescription());
        context.put(VelocityLabel.AGGREGATION_CLASS_ID, ASTAggregateRoot.getId());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, ASTAggregateRoot.getPropertyList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, ASTAggregateRoot.getMethodList());

        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, getTargetElementList(ASTEnum.class));
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, getTargetElementList(ASTCommand.class));
        context.put(VelocityLabel.AGGREGATION_ENTITY_LIST, getTargetElementList(ASTEntity.class));
        context.put(VelocityLabel.AGGREGATION_QUERY_LIST, "queryList");
        context.put(VelocityLabel.AGGREGATION_PAGE_QUERY_LIST, "pageQueryList");
        context.put(VelocityLabel.AGGREGATION_QUERY_RESULT_LIST, "queryResultList");

        context.put(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER,
                ASTAggregateRoot.getName().toLowerCase(Locale.ROOT));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_UNDERSCORE,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_CAMEL,
                CaseFormat.UPPER_CAMEL.converterTo(CaseFormat.LOWER_CAMEL));
        context.put(VelocityLabel.AGGREGATION_GENERATOR_UTIL, new AggregationStrategy.AggregationGeneratorUtil());
        context.put(VelocityLabel.URL_AGGREGATION, ASTAggregateRoot.getName().toLowerCase());
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

    private List<Element> getTargetElementList(Class<? extends Element> targetClass) {
        return ASTAggregate.getElementList().stream()
                .filter(element -> Objects.equals(element.getClass(), targetClass)).collect(Collectors.toList());
    }

    public class AggregationGeneratorUtil {

        public String dtoEnumType2Value(String umlFieldType) {
            List<Element> targetElementList = getTargetElementList(ASTEnum.class);

            for (Element aEnum: targetElementList) {
                String enumName = ((ASTEnum) aEnum).getName();
                if (Objects.equals(enumName, umlFieldType)) {
                    return "Integer";
                }
                if (Objects.equals("List<"+enumName+">", umlFieldType)) {
                    return "List<Integer>";
                }
            }
            return umlFieldType;
        }

        public String doEnumType2Value(String umlFieldType) {

            List<Element> targetElementList = getTargetElementList(ASTEnum.class);
            for (Element aEnum: targetElementList) {
                String enumName = ((ASTEnum) aEnum).getName();
                if (Objects.equals(enumName, umlFieldType)) {
                    return "Integer";
                }
                if (Objects.equals("List<"+enumName+">", umlFieldType)) {
                    return "String";
                }
            }
            return umlFieldType;
        }
    }
}

package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.generate.element.*;
import com.wd.paas.generator.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.constant.ModelUrlConstant;
import com.wd.paas.generator.constant.VelocityLabel;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author shimmer
 */
public class AggregationStrategy extends AbstractElementStrategy {

    private final Aggregate aggregate;

    public AggregationStrategy(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        AggregateRoot aggregateRoot = Optional.of(aggregate.getRoot()).orElse(new AggregateRoot());
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, aggregateRoot.getName());
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, aggregateRoot.getDescription());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, aggregateRoot.getPropertyList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, aggregateRoot.getMethodList());

        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, getTargetElementList(AEnum.class));
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, getTargetElementList(Command.class));
        context.put(VelocityLabel.AGGREGATION_ENTITY_LIST, getTargetElementList(Entity.class));
        context.put(VelocityLabel.AGGREGATION_QUERY_LIST, "queryList");
        context.put(VelocityLabel.AGGREGATION_PAGE_QUERY_LIST, "pageQueryList");
        context.put(VelocityLabel.AGGREGATION_QUERY_RESULT_LIST, "queryResultList");

        context.put(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER,
                aggregateRoot.getName().toLowerCase(Locale.ROOT));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_UNDERSCORE,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_CAMEL,
                CaseFormat.UPPER_CAMEL.converterTo(CaseFormat.LOWER_CAMEL));
        context.put(VelocityLabel.AGGREGATION_GENERATOR_UTIL, new AggregationStrategy.AggregationGeneratorUtil());
        context.put(VelocityLabel.URL_AGGREGATION, aggregateRoot.getName().toLowerCase());
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
        return aggregate.getElementList().stream()
                .filter(element -> Objects.equals(element.getClass(), targetClass)).collect(Collectors.toList());
    }

    public class AggregationGeneratorUtil {

//        public String dtoEnumType2Value(String umlFieldType) {
//            for (EnumGenerator enumGenerator : enumList) {
//                String enumName = enumGenerator.getUmlClass().getClassName();
//                if (Objects.equals(enumName, umlFieldType)) {
//                    return "Integer";
//                }
//                if (Objects.equals("List<"+enumName+">", umlFieldType)) {
//                    return "List<Integer>";
//                }
//            }
//            return umlFieldType;
//        }
//
//        public String doEnumType2Value(String umlFieldType) {
//            for (EnumGenerator enumGenerator : enumList) {
//                String enumName = enumGenerator.getUmlClass().getClassName();
//                if (Objects.equals(enumName, umlFieldType)) {
//                    return "Integer";
//                }
//                if (Objects.equals("List<"+enumName+">", umlFieldType)) {
//                    return "String";
//                }
//            }
//            return umlFieldType;
//        }
    }
}

package com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.constant.ModelUrlConstant;
import com.wd.paas.generator.newdsl.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.generate.visitor.element.Aggregate;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, aggregate.getRoot().getName());
//        context.put(VelocityLabel.AGGREGATION_CLASS_PACKAGE, "umlClass.getClassPackage()");
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, aggregate.getRoot().getDescription());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, aggregate.getRoot().getPropertyList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, aggregate.getRoot().getMethodList());
        context.put(VelocityLabel.AGGREGATION_ENUM_LIST, "enumList");
        context.put(VelocityLabel.AGGREGATION_CMD_LIST, "cmdList");
        context.put(VelocityLabel.AGGREGATION_QUERY_LIST, "queryList");
        context.put(VelocityLabel.AGGREGATION_PAGE_QUERY_LIST, "pageQueryList");
        context.put(VelocityLabel.AGGREGATION_QUERY_RESULT_LIST, "queryResultList");
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME_ALL_LOWER, aggregate.getRoot().getName().toLowerCase(Locale.ROOT));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_HYPHEN,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_HYPHEN));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_UNDERSCORE,
                CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE));
        context.put(VelocityLabel.CASE_FORMAT_LOWER_CAMEL,
                CaseFormat.UPPER_CAMEL.converterTo(CaseFormat.LOWER_CAMEL));
        context.put(VelocityLabel.AGGREGATION_GENERATOR_UTIL, new AggregationStrategy.AggregationGeneratorUtil());
        context.put(VelocityLabel.URL_AGGREGATION, aggregate.getRoot().getName().toLowerCase());
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

package com.wd.paas.generator.common.util;

import com.wd.paas.generator.generate.element.ASTEnum;
import com.wd.paas.generator.generate.element.Element;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.AggregationStrategy;

import java.util.List;
import java.util.Objects;

public class EnumTypeUtil {

    public AggregationStrategy aggregationStrategy;

    public EnumTypeUtil(AggregationStrategy aggregationStrategy) {
        this.aggregationStrategy = aggregationStrategy;
    }

    public String dtoEnumType2Value(String umlFieldType) {
        List<Element> targetElementList = aggregationStrategy.getTargetElementList(ASTEnum.class);

        for (Element aEnum : targetElementList) {
            String enumName = ((ASTEnum) aEnum).getName();
            if (Objects.equals(enumName, umlFieldType)) {
                return "Integer";
            }
            if (Objects.equals("List<" + enumName + ">", umlFieldType)) {
                return "List<Integer>";
            }
        }
        return umlFieldType;
    }

    public String doEnumType2Value(String umlFieldType) {

        List<Element> targetElementList = aggregationStrategy.getTargetElementList(ASTEnum.class);
        for (Element aEnum : targetElementList) {
            String enumName = ((ASTEnum) aEnum).getName();
            if (Objects.equals(enumName, umlFieldType)) {
                return "Integer";
            }
            if (Objects.equals("List<" + enumName + ">", umlFieldType)) {
                return "String";
            }
        }
        return umlFieldType;
    }
}

package com.wd.paas.generator.newdsl.constant;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/***
 * @author wangchensheng
 */
@Getter
public enum ElementTypeEnum {

    /**/
    APPLICATION("Application"),
    BUSINESS_DOMAIN("BusinessDomain"),
    AGGREGATE("Aggregate"),
    VALUE_OBJECT("ValueObject"),
    COMMAND("Command"),
    AENUM("AEnum"),
    DEFAULT("Default"),
    ;

    private final String value;

    ElementTypeEnum(String value) {
        this.value = value;
    }

    /**
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return ElementTypeEnum
     */
    public static ElementTypeEnum of(String enumName) {
        Optional<ElementTypeEnum> optional = Arrays.stream(ElementTypeEnum.values()).filter(x -> x.value.equals(enumName)).findFirst();
        return optional.orElse(DEFAULT);
    }
}

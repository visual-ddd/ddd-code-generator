package com.wd.paas.generator.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/***
 * @author wangchensheng
 */
@Getter
public enum ElementTypeEnum {

    /**/
    APPLICATION("ApplicationNode"),
    BUSINESS_DOMAIN("BusinessDomainNode"),
    AGGREGATE("AggregateNode"),
    APPLICATION_ROOT("AggregateRootNode"),
    VALUE_OBJECT("ValueObjectNode"),
    COMMAND("CommandNode"),
    ENUM("EnumNode"),
    ENTITY("EntityNode"),
    DEFAULT("DefaultNode"),
    QUERY("QueryNode"),
    DTO("DtoNode"),
    OBJECT_MAPPER("ObjectMapperNode"),
    DATA_OBJECT("DataObjectNode"),
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

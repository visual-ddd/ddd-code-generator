package com.wd.paas.common.enums;

import java.util.Optional;

/**
 * 数据对应关系
 *
 * @author wangchensheng
 */
public enum CardinalityEnum {

    ONE_TO_ONE(1, "OneToOne"),
    ONE_TO_MANY(2, "OneToMany"),
    MANY_TO_MANY(3, "ManyToMany"),
    MANY_TO_ONE(4, "ManyToOne"),
    ;

    CardinalityEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    private final Integer code;
    private final String name;

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    /**
     * 根据code码获取枚举
     */
    public static Optional<CardinalityEnum> of(Integer code) {
        for (CardinalityEnum t : CardinalityEnum.class.getEnumConstants()) {
            if (t.getCode().intValue() == code.intValue()) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}
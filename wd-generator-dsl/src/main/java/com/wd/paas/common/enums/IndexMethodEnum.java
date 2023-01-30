package com.wd.paas.common.enums;

import java.util.Optional;

/**
 * 方法索引
 *
 * @author wangchensheng
 */
public enum IndexMethodEnum {

    BREE(1, "Bree"),
    HASH(2, "Hash"),
    ;

    IndexMethodEnum(Integer code, String name) {
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
    public static Optional<IndexMethodEnum> of(Integer code) {
        for (IndexMethodEnum t : IndexMethodEnum.class.getEnumConstants()) {
            if (t.getCode().intValue() == code.intValue()) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}
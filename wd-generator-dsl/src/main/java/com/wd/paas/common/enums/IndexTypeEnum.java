package com.wd.paas.common.enums;

import java.util.Optional;

/**
 * 类型索引
 *
 * @author wangchensheng
 */
public enum IndexTypeEnum {

    NORMAL(1, "Normal"),
    UNIQUE(2, "Unique"),
    PRIMARY(3, "Primary"),
    FULLTEXT(4, "FullText"),
    ;

    IndexTypeEnum(Integer code, String name) {
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
    public static Optional<IndexTypeEnum> of(Integer code) {
        for (IndexTypeEnum t : IndexTypeEnum.class.getEnumConstants()) {
            if (t.getCode().intValue() == code.intValue()) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}
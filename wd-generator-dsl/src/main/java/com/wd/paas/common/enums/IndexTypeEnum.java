package com.wd.paas.common.enums;

import java.util.Arrays;
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
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return CmdTypeEnum
     */
    public static IndexTypeEnum of(String enumName) {
        Optional<IndexTypeEnum> optional = Arrays.stream(IndexTypeEnum.values()).filter(x -> x.name.equals(enumName)).findFirst();
        return optional.orElseThrow(() -> new IllegalArgumentException("ElementTypeEnum find error，not found:" + enumName));
    }

}
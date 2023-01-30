package com.wd.paas.common.enums;

import java.util.Optional;

/**
 * 数据类型
 *
 * @author wangchensheng
 */
public enum DataTypeEnum {

    BOOLEAN(1, "Boolean"),
    TEXT(2, "Text"),
    LONGTEXT(3, "LongText"),
    DATE(4, "Date"),
    DATE_TIME(5, "DateTime"),
    TIME_STAMP(6, "TimeStamp"),
    INTEGER(7, "Integer"),
    LONG(8, "Long"),
    DOUBLE(9, "Double"),
    FLOAT(10, "Float"),
    DECIMAL(11, "Decimal"),
    STRING(12, "String"),
    ;

    DataTypeEnum(Integer code, String name) {
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
    public static Optional<DataTypeEnum> of(Integer code) {
        for (DataTypeEnum t : DataTypeEnum.class.getEnumConstants()) {
            if (t.getCode().intValue() == code.intValue()) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}
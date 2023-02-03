package com.wd.paas.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月03日 09:31:47
 */
@Getter
public enum ConvertTypeEnum {

    /**/
    ENTITY2DO(1, "entity"),
    DTO2DO(2 , "dto");

    private final Integer code;
    private final String value;

    ConvertTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    /**
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return CmdTypeEnum
     */
    public static ConvertTypeEnum of(String enumName) {
        Optional<ConvertTypeEnum> optional = Arrays.stream(ConvertTypeEnum.values()).filter(x -> x.value.equals(enumName)).findFirst();
        return optional.orElseThrow(() -> new IllegalArgumentException("ElementTypeEnum find error，not found:" + enumName));
    }
}
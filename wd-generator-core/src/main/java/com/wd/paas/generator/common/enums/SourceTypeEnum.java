package com.wd.paas.generator.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
public enum SourceTypeEnum {

    /**/
    HTTP(1, "http"),
    RPC(2, "rpc");

    private final Integer code;
    private final String value;

    SourceTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    /**
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return CmdTypeEnum
     */
    public static SourceTypeEnum of(String enumName) {
        Optional<SourceTypeEnum> optional = Arrays.stream(SourceTypeEnum.values()).filter(x -> x.value.equals(enumName)).findFirst();
        return optional.orElseThrow(() -> new IllegalArgumentException("ElementTypeEnum find error，not found:" + enumName));
    }

    public static List<String> getValueList() {
        return Arrays.stream(SourceTypeEnum.values()).map(SourceTypeEnum::getValue).collect(Collectors.toList());
    }
}

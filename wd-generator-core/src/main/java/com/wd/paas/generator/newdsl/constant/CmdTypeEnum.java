package com.wd.paas.generator.newdsl.constant;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * 代码生成方式
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/10/15 09:12
 */
@Getter
public enum CmdTypeEnum {

    /**/
    SAVE(1, "save"),
    MODIFY(2, "modify"),
    REMOVE(3, "remove");

    private final Integer code;
    private final String value;

    CmdTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    /**
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return CmdTypeEnum
     */
    public static CmdTypeEnum of(String enumName) {
        Optional<CmdTypeEnum> optional = Arrays.stream(CmdTypeEnum.values()).filter(x -> x.value.equals(enumName)).findFirst();
        return optional.orElseThrow(() -> new IllegalArgumentException("ElementTypeEnum find error，not found:" + enumName));
    }
}

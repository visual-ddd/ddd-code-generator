package com.wd.paas.generator.common.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/***
 * 指令触发来源类型
 *
 * @author shimmer
 */
@Getter
public enum CommandSourceTypeEnum {

    /**/
    HTTP("http"),
    RPC("rpc"),
    EVENT("event"),
    SCHEDULE("schedule"),
    ;

    private final String value;

    CommandSourceTypeEnum(String value) {
        this.value = value;
    }

    /**
     * 根据枚举类字符串找到对应枚举类型
     *
     * @param enumName 枚举类名称
     * @return ElementTypeEnum
     */
    public static CommandSourceTypeEnum of(String enumName) {
        Optional<CommandSourceTypeEnum> optional = Arrays.stream(CommandSourceTypeEnum.values())
                .filter(x -> x.value.equals(enumName)).findFirst();
        return optional.orElseThrow(() -> new RuntimeException("找不到指令触发类型: " + enumName));
    }
}

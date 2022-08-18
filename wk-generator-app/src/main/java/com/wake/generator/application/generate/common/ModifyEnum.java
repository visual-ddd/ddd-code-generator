package com.wake.generator.application.generate.common;

import lombok.Getter;

/**
 * 修饰符枚举
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/18
 */
@Getter
public enum ModifyEnum {

    /**
     * 公有
     */
    PUBLIC("+", "public"),

    /**
     * 私有
     */
    PRIVATE("-", "private"),
    ;

    private final String sign;
    private final String value;

    ModifyEnum(String sign, String value) {
        this.sign = sign;
        this.value = value;
    }
}

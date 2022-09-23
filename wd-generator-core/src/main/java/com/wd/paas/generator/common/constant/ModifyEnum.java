package com.wd.paas.generator.common.constant;

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

    public static String getModify(String sign) {
        for (ModifyEnum modifyEnum : ModifyEnum.values()) {
            if (modifyEnum.sign.equals(sign)) {
                return modifyEnum.value;
            }
        }
        return null;
    }
}

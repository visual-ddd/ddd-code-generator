package com.wake.generator.client.generete.common;

import lombok.Getter;

@Getter
public enum ModifyEnum {

    PUBLIC("+", "public"),

    PRIVATE("-", "private"),
    ;

    private String sign;

    private String value;

    ModifyEnum(String sign, String value) {
        this.sign = sign;
        this.value = value;
    }
}

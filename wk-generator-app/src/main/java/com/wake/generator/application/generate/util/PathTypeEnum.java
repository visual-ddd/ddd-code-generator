package com.wake.generator.application.generate.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 读取方式Enum
 *
 * @author 佟蕊
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PathTypeEnum {

    RECOURCE("recource"),

    FULL_PATH("full");

    private String type;
}

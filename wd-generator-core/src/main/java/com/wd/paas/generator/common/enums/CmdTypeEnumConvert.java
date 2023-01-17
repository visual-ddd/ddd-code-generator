package com.wd.paas.generator.common.enums;

import lombok.Getter;

/**
 * 代码生成方式
 */
@Getter
public class CmdTypeEnumConvert {

    public static CmdTypeEnum ofValue(String enumName) {
        return CmdTypeEnum.of(enumName);
    }
}

package com.wd.paas.generator.constant;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

/**
 * 代码生成方式
 */
@Getter
public class CmdTypeEnumConvert {

    public static CmdTypeEnum ofValue(String enumName) {
        return CmdTypeEnum.of(enumName);
    }
}

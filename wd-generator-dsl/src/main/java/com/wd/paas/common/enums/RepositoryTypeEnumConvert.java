package com.wd.paas.common.enums;

import com.wd.paas.common.enums.RepositoryTypeEnum;

/**
 * 仓储能力类型 枚举转换器
 */
public class RepositoryTypeEnumConvert {

    public static RepositoryTypeEnum ofValue(String enumName) {
        return RepositoryTypeEnum.of(enumName);
    }
}

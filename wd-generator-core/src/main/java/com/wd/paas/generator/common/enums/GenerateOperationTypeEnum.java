package com.wd.paas.generator.common.enums;

import lombok.Getter;

/**
 * 代码生成的操作类型
 */
@Getter
public enum GenerateOperationTypeEnum {

    /**/
    INIT_CODE("init_code", "初始化代码"),
    UPDATE_CODE("update_code", "更新代码")
    ;

    private final String value;
    private final String desc;

    GenerateOperationTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

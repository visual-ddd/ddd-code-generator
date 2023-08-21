package com.wd.paas.generator.common.enums;

import lombok.Data;
import lombok.Getter;

/**
 * 项目框架类型
 */
@Getter
public enum ProjectTemplateType {

    /**/
    COLA("cola", "默认COLA分层架构"),
    COLA_SINGLE("cola-single", "COLA单体架构")
    ;

    private final String value;
    private final String desc;

    ProjectTemplateType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

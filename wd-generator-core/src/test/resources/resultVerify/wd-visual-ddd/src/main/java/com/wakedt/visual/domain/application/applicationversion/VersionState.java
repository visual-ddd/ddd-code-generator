package com.wakedt.visual.domain.application.applicationversion;

import com.wakedata.common.core.base.BaseEnum;

/**
 * 版本状态-枚举
 */
public enum VersionState implements BaseEnum {

    /** 已发布 */
    PUBLISHED("1", "版本已发布"),

    /** 未发布 */
    UN_PUBLISHED("2", "版本未发布"),
    ;

    private final String value;
    private final String desc;

    VersionState(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
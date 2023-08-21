package com.wakedt.visual.domain.universallanguage.universallanguage;

import com.wakedata.common.core.base.BaseEnum;

/**
 * 统一语言类型-枚举
 */
public enum LanguageType implements BaseEnum {

    /** 组织统一语言 */
    ORGANIZATION_LANGUAGE_TYPE(1, "组织下共用的统一语言"),

    /** 团队统一语言 */
    TEAM_LANGUAGE(2, "团队下共用的统一语言"),
    ;

    private final Integer value;
    private final String desc;

    LanguageType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
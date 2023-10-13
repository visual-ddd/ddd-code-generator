package com.wakedt.visual.domaindesign.domain.domaindesignversion;

import com.wakedata.common.core.base.BaseEnum;

/**
 * 版本状态-枚举
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public enum VersionState implements BaseEnum {

    /** 已发布 */
    PUBLISHED(1, "版本已发布"),

    /** 未发布 */
    UN_PUBLISHED(2, "版本未发布"),
    ;

    private final Integer value;
    private final String desc;

    VersionState(Integer value, String desc) {
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
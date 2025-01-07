package com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion;

import com.wakedata.common.core.base.BaseEnum;

/**
 * 版本状态-枚举
 *
 * @author visual-ddd
 * @since 1.0
 */
public enum VersionState implements BaseEnum {

    /** 未发布 */
    UN_PUBLISHED(1, "版本未发布"),

    /** 已发布 */
    PUBLISHED(2, "版本已发布"),
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
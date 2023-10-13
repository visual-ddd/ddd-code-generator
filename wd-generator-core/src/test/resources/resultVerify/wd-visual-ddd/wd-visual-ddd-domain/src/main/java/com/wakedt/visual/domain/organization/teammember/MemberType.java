package com.wakedt.visual.domain.organization.teammember;

import com.wakedata.common.core.base.BaseEnum;

/**
 * 团队成员类型-枚举
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public enum MemberType implements BaseEnum {

    /** 产品经理 */
    PM(1, "需求发起者和验收者，主要负责业务域和业务场景需求的输入、验收项目接口和参与领域建模"),

    /** 架构师 */
    ARCHITECT(0, "应用的管理者和领域建模的监督者，主要负责应用的管理和发布、审核领域建模和参与领域建模"),

    /** 开发者 */
    DEVELOPER(0, "包括后端开发、前端开发、测试等具体的项目开发人员；主要负责功能开发和参与领域建模"),
    ;

    private final Integer value;
    private final String desc;

    MemberType(Integer value, String desc) {
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
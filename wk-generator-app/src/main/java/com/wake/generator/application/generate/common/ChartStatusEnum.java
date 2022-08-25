package com.wake.generator.application.generate.common;

import lombok.Getter;

/**
 * 领域图谱状态
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/25
 */
@Getter
public enum ChartStatusEnum {

    /**
     * 初始化
     */
    INIT(0L, "初始化的图谱");

    private final String description;
    private final Long value;

    ChartStatusEnum(Long value, String description) {
        this.description = description;
        this.value = value;
    }

}

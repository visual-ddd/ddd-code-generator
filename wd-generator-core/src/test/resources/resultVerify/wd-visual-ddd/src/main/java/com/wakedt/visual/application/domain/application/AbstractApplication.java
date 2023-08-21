package com.wakedt.visual.application.domain.application;

import lombok.Data;

/**
 * 应用-聚合根
 */
@Data
public abstract class AbstractApplication {

    /** 应用 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

}
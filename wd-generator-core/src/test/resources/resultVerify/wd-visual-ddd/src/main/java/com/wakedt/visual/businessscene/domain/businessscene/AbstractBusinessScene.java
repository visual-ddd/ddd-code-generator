package com.wakedt.visual.businessscene.domain.businessscene;

import lombok.Data;

/**
 * 业务场景-聚合根
 */
@Data
public abstract class AbstractBusinessScene {

    /** 业务场景 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

}
package com.wakedt.visual.domain.businessscene.businessscene;

import lombok.Data;

/**
 * 业务场景-聚合根
 *
 * @author shimmer
 * @since 1.0
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
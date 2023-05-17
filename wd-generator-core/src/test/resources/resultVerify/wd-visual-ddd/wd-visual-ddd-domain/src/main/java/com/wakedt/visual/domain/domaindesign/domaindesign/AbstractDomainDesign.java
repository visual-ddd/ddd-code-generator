package com.wakedt.visual.domain.domaindesign.domaindesign;

import lombok.Data;

/**
 * 业务域-聚合根
 */
@Data
public abstract class AbstractDomainDesign {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 团队ID */
    private Long teamId;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

}
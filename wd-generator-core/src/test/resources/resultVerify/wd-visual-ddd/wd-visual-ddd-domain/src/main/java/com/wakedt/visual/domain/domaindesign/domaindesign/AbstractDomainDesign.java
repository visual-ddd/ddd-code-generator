package com.wakedt.visual.domain.domaindesign.domaindesign;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 维护业务域及版本的领域-聚合根
 */
@Data
public abstract class AbstractDomainDesign {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 描述信息 */
    private String description;

}
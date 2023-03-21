package com.wakedt.visual.domain.organization.team;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。-聚合根
 */
@Data
public abstract class AbstractTeam {

    /**  */
    public Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织唯一标识 */
    private Long organizationId;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;

}
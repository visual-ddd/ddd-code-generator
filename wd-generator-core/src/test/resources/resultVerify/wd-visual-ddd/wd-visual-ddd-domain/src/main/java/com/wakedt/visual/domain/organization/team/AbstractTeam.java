package com.wakedt.visual.domain.organization.team;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 团队-聚合根
 */
@Data
public abstract class AbstractTeam {

    /** 团队ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;

}
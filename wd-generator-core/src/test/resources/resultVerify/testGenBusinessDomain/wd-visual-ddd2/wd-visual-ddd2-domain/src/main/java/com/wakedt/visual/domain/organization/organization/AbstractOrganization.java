package com.wakedt.visual.domain.organization.organization;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 组织结构管理的领域-聚合根
 */
@Data
public abstract class AbstractOrganization {

    /**  */
    public Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String descritption;

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationTeamManagerId;

}
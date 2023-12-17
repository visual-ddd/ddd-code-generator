package com.wakedt.visual.domain.organization.team.teamcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增团队-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamCreateCmd {

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;

}
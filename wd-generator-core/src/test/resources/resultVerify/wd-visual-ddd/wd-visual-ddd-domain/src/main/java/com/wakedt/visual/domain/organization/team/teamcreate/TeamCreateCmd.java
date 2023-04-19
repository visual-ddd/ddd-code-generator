package com.wakedt.visual.domain.organization.team.teamcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 新增团队-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamCreateCmd {

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织唯一标识 */
    private Long organizationId;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;

}
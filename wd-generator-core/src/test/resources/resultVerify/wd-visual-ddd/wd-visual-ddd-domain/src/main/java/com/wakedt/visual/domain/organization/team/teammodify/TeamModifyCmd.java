package com.wakedt.visual.domain.organization.team.teammodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 编辑团队-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamModifyCmd {

    /** 团队 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织唯一标识 */
    private Long organizationId;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;

}
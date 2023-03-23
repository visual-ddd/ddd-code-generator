package com.wakedt.visual.domain.organization.team.teammanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 绑定团队管理员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamManagerBindCmd {

    /** 团队 ID */
    private Long id;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;

}
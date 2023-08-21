package com.wakedt.visual.organization.app.cmd.teammanagerbind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 绑定团队管理员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamManagerBindCmd {

    /** 团队 ID */
    private Long id;

    /** 团队管理员 */
    private Long teamManagerId;

}
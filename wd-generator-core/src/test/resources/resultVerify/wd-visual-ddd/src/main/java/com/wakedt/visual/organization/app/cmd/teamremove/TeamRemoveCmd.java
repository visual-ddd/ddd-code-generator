package com.wakedt.visual.organization.app.cmd.teamremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除团队-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamRemoveCmd {

    /** 团队 ID */
    private Long id;

}
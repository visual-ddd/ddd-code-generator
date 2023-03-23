package com.wakedt.visual.domain.organization.team.teamremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.team.*;

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
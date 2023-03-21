package com.wakedt.visual.domain.organization.teammember.memberremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamMemberRemoveCmd {

    /** 团队成员ID */
    private Long id;

}
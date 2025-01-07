package com.wakedt.visual.bizdomain.organization.domain.teammember;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmd;

/**
 * 团队成员-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class TeamMember {

    /** 团队成员ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 成员账号ID */
    private Long accountId;

    /** 成员类型标签 */
    private List<Integer> memberTypeList;

    public void teamMemberRemove(TeamMemberRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void teamMemberRoleBind(TeamMemberRoleBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

    public void teamManagerRoleUnbind(TeamMemberRoleUnBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

}
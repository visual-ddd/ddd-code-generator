package com.wakedt.visual.organization.domain.teammember;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.organization.app.cmd.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmd;

/**
 * 团队成员-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
    private List<MemberType> memberTypeList;

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
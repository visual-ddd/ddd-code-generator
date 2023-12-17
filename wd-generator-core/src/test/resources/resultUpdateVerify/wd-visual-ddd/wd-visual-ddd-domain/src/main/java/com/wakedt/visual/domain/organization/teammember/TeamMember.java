package com.wakedt.visual.domain.organization.teammember;

import com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind.TeamMemberRoleUnBindCmd;
import com.wakedt.visual.domain.organization.teammember.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.domain.organization.teammember.teammemberrolebind.TeamMemberRoleBindCmd;

/**
 * 团队成员-聚合根能力
 *
 * @author shimmer
 * @since 1.0
 */
public class TeamMember extends AbstractTeamMember {

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
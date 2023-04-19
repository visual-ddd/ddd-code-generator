package com.wakedt.visual.domain.organization.teammember;

import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.teammember.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.domain.organization.teammember.teammemberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind.TeamMemberRoleUnBindCmd;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位-聚合根能力
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
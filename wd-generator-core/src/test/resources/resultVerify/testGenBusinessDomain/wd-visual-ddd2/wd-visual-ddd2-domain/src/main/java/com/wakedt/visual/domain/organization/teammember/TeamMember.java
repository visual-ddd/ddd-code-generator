package com.wakedt.visual.domain.organization.teammember;

import java.util.List;
import com.wakedt.visual.domain.organization.teammember.memberadd.TeamMemberAddCmd;
import com.wakedt.visual.domain.organization.teammember.memberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.domain.organization.teammember.memberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.domain.organization.teammember.managerroleunbind.TeamMemberRoleUnBindCmd;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位-聚合根能力
 */
public class TeamMember extends AbstractTeamMember {

    /**  */
    @Override
    public void untitled() {
        // TODO: ()
    }

    public void memberAdd(TeamMemberAddCmd updateCmd) {
        this.setAccountId(updateCmd.getAccountId());
        this.setTeamId(updateCmd.getTeamId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

    public void memberRemove(TeamMemberRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void memberRoleBind(TeamMemberRoleBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

    public void managerRoleUnbind(TeamMemberRoleUnBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }
}
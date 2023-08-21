package com.wakedt.visual.organization.domain.team;

import com.wakedt.visual.organization.app.cmd.teammanagerbind.TeamManagerBindCmd;
import com.wakedt.visual.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmd;
import com.wakedt.visual.organization.app.cmd.teammodify.TeamModifyCmd;
import com.wakedt.visual.organization.app.cmd.teamremove.TeamRemoveCmd;

/**
 * 团队-聚合根能力
 */
public class Team extends AbstractTeam {

    public void teamModify(TeamModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
        this.setOrganizationId(updateCmd.getOrganizationId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void teamRemove(TeamRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void teamManagerBind(TeamManagerBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void teamManagerUnbind(TeamManagerUnBindCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}
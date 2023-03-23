package com.wakedt.visual.domain.organization.team;

import java.util.List;
import com.wakedt.visual.domain.organization.team.teammodify.TeamModifyCmd;
import com.wakedt.visual.domain.organization.team.teamremove.TeamRemoveCmd;
import com.wakedt.visual.domain.organization.team.teammanagerbind.TeamManagerBindCmd;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmd;

/**
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。-聚合根能力
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
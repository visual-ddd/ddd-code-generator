package com.wakedt.visual.domain.organization.team;

import java.util.List;
import com.wakedt.visual.domain.organization.team.modify.TeamModifyCmd;
import com.wakedt.visual.domain.organization.team.remove.TeamRemoveCmd;
import com.wakedt.visual.domain.organization.team.managerbind.TeamManagerBindCmd;
import com.wakedt.visual.domain.organization.team.managerunbind.TeamManagerUnBindCmd;

/**
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。-聚合根能力
 */
public class Team extends AbstractTeam {

    public void modify(TeamModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
        this.setOrganizationId(updateCmd.getOrganizationId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void remove(TeamRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void managerBind(TeamManagerBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void managerUnBind(TeamManagerUnBindCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}
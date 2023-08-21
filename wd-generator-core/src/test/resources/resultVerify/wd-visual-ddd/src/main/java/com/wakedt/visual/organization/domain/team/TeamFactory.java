package com.wakedt.visual.organization.domain.team;

import com.wakedt.visual.organization.app.cmd.teamcreate.TeamCreateCmd;
import org.springframework.stereotype.Component;

/**
 * 团队-聚合根-工厂
 */
@Component
public class TeamFactory {

    public Team getInstance(TeamCreateCmd createCmd) {
        Team instance = new Team();
        instance.setName(createCmd.getName());
        instance.setDescription(createCmd.getDescription());
        instance.setOrganizationId(createCmd.getOrganizationId());
        instance.setTeamManagerId(createCmd.getTeamManagerId());
        return instance;
    }

}

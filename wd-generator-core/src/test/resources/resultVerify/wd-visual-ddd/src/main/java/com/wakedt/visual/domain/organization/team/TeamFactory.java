package com.wakedt.visual.domain.organization.team;

import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmd;
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

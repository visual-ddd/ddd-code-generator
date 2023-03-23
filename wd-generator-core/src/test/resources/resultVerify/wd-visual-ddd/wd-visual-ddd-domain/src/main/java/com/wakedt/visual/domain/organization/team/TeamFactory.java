package com.wakedt.visual.domain.organization.team;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmd;

/**
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。-聚合根-工厂
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

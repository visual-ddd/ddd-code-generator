package com.wakedt.visual.domain.organization.team;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmd;

/**
 * 团队-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0
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

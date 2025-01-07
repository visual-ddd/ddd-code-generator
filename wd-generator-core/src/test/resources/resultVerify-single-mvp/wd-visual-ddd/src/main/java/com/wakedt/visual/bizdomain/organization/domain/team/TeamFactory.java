package com.wakedt.visual.bizdomain.organization.domain.team;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.organization.app.cmd.teamcreate.TeamCreateCmd;

/**
 * 团队-聚合根-工厂
 *
 * @author visual-ddd
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

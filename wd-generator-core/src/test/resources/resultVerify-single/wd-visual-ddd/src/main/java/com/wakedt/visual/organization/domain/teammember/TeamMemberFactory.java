package com.wakedt.visual.organization.domain.teammember;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.app.cmd.teammemberadd.TeamMemberAddCmd;

/**
 * 团队成员-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class TeamMemberFactory {

    public TeamMember getInstance(TeamMemberAddCmd createCmd) {
        TeamMember instance = new TeamMember();
        instance.setAccountId(createCmd.getAccountId());
        instance.setTeamId(createCmd.getTeamId());
        instance.setMemberTypeList(createCmd.getMemberTypeList());
        return instance;
    }

}

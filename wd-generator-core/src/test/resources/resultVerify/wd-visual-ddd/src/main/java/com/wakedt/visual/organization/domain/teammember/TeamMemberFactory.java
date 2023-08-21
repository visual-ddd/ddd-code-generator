package com.wakedt.visual.organization.domain.teammember;

import com.wakedt.visual.organization.app.cmd.teammemberadd.TeamMemberAddCmd;
import org.springframework.stereotype.Component;

/**
 * 团队成员-聚合根-工厂
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

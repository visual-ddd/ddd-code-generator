package com.wakedt.visual.domain.organization.teammember;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.teammember.teammemberadd.TeamMemberAddCmd;

/**
 * 团队成员-聚合根-工厂
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
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

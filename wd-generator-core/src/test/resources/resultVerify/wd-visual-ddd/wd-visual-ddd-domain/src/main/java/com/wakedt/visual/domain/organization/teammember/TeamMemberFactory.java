package com.wakedt.visual.domain.organization.teammember;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.teammember.teammemberadd.TeamMemberAddCmd;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位-聚合根-工厂
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

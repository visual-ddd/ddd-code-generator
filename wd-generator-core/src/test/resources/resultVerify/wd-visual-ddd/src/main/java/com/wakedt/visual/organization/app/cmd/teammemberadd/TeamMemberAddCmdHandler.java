package com.wakedt.visual.organization.app.cmd.teammemberadd;

import com.wakedt.visual.organization.domain.teammember.TeamMember;
import com.wakedt.visual.organization.domain.teammember.TeamMemberFactory;
import com.wakedt.visual.organization.domain.teammember.TeamMemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 添加团队成员-指令处理器
 */
@Component
public class TeamMemberAddCmdHandler {

    @Resource
    private TeamMemberRepository repository;
    @Resource
    private TeamMemberFactory factory;

    public Long handle(TeamMemberAddCmd createCmd) {
        TeamMember entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedTeamMember(团队成员不能重复) 校验团队成员是否重复 */

        TeamMember newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
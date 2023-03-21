package com.wakedt.visual.domain.organization.teammember.memberadd;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 添加团队成员-指令处理器
 */
@Component
public class TeamMemberAddCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberAddCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.memberAdd(updateCmd);
        repository.update(teamMember);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberAddEvent(updateCmd));
    }
}
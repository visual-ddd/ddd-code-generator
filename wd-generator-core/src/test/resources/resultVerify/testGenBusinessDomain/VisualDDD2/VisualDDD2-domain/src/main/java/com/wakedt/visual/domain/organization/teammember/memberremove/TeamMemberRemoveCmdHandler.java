package com.wakedt.visual.domain.organization.teammember.memberremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令处理器
 */
@Component
public class TeamMemberRemoveCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRemoveCmd removeCmd) {
        TeamMember teamMember = repository.find(removeCmd.getId());
        teamMember.memberRemove(removeCmd);
        repository.remove(teamMember);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberRemoveEvent(removeCmd));
    }
}
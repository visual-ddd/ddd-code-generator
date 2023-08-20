package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import com.wakedt.visual.domain.organization.teammember.TeamMember;
import com.wakedt.visual.domain.organization.teammember.TeamMemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 删除团队成员-指令处理器
 */
@Component
public class TeamMemberRemoveCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRemoveCmd removeCmd) {
        TeamMember teamMember = repository.find(removeCmd.getId());
        teamMember.teamMemberRemove(removeCmd);

        repository.remove(teamMember);

       // DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberRemoveEvent(removeCmd));
    }
}
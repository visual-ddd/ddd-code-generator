package com.wakedt.visual.domain.organization.teammember.teammemberrolebind;

import com.wakedt.visual.domain.organization.teammember.TeamMember;
import com.wakedt.visual.domain.organization.teammember.TeamMemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 绑定团队成员职位-指令处理器
 */
@Component
public class TeamMemberRoleBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleBindCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamMemberRoleBind(updateCmd);

        repository.update(teamMember);

       // DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberRoleBindEvent(updateCmd));
    }
}
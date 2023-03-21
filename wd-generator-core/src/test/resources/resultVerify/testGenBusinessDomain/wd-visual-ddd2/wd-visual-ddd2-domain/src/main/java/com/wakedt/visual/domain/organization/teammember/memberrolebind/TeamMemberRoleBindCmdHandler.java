package com.wakedt.visual.domain.organization.teammember.memberrolebind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 绑定团队成员职位-指令处理器
 */
@Component
public class TeamMemberRoleBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleBindCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.memberRoleBind(updateCmd);
        repository.update(teamMember);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberRoleBindEvent(updateCmd));
    }
}
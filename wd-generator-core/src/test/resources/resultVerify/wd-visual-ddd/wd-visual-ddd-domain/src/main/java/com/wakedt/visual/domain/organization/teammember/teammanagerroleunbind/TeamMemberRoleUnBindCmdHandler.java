package com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 解绑团队成员职位-指令处理器
 */
@Component
public class TeamMemberRoleUnBindCmdHandler {

    @Resource
    private TeamMemberRepository repository;

    public void handle(TeamMemberRoleUnBindCmd updateCmd) {
        TeamMember teamMember = repository.find(updateCmd.getId());
        teamMember.teamManagerRoleUnbind(updateCmd);

        repository.update(teamMember);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamMemberRoleUnBindEvent(updateCmd));
    }
}
package com.wakedt.visual.organization.app.cmd.teammemberremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.teammember.*;

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
    }
}
package com.wakedt.visual.domain.organization.team.remove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 删除团队-指令处理器
 */
@Component
public class TeamRemoveCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamRemoveCmd removeCmd) {
        Team team = repository.find(removeCmd.getId());
        team.remove(removeCmd);
        repository.remove(team);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamRemoveEvent(removeCmd));
    }
}
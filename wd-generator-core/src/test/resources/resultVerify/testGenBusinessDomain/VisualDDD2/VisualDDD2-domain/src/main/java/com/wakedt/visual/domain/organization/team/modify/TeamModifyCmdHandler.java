package com.wakedt.visual.domain.organization.team.modify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 编辑团队-指令处理器
 */
@Component
public class TeamModifyCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamModifyCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.modify(updateCmd);
        repository.update(team);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamModifyEvent(updateCmd));
    }
}
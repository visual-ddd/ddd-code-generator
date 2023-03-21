package com.wakedt.visual.domain.organization.team.managerunbind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 解绑团队管理员-指令处理器
 */
@Component
public class TeamManagerUnBindCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamManagerUnBindCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.managerUnBind(updateCmd);
        repository.update(team);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamManagerUnBindEvent(updateCmd));
    }
}
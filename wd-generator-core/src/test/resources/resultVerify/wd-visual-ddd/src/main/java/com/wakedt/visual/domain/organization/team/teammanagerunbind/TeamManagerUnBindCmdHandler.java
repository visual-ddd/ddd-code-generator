package com.wakedt.visual.domain.organization.team.teammanagerunbind;

import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.domain.organization.team.TeamRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 解绑团队管理员-指令处理器
 */
@Component
public class TeamManagerUnBindCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamManagerUnBindCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.teamManagerUnbind(updateCmd);

        repository.update(team);

       // DomainEventPublisher.getInstance().postAfterCommit(new TeamManagerUnBindEvent(updateCmd));
    }
}
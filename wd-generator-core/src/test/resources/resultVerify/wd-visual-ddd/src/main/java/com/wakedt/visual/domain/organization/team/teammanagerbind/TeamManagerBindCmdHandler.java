package com.wakedt.visual.domain.organization.team.teammanagerbind;

import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.domain.organization.team.TeamRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 绑定团队管理员-指令处理器
 */
@Component
public class TeamManagerBindCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamManagerBindCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.teamManagerBind(updateCmd);

        repository.update(team);

       // DomainEventPublisher.getInstance().postAfterCommit(new TeamManagerBindEvent(updateCmd));
    }
}
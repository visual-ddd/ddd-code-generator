package com.wakedt.visual.organization.app.cmd.teammanagerbind;

import com.wakedt.visual.organization.domain.team.Team;
import com.wakedt.visual.organization.domain.team.TeamRepository;
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
    }
}
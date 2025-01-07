package com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.team.*;

/**
 * 绑定团队管理员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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
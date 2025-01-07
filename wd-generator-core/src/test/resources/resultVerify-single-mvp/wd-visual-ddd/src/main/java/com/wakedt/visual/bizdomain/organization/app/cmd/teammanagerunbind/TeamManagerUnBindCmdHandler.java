package com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerunbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.team.*;

/**
 * 解绑团队管理员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class TeamManagerUnBindCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamManagerUnBindCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.teamManagerUnbind(updateCmd);

        repository.update(team);
    }
}
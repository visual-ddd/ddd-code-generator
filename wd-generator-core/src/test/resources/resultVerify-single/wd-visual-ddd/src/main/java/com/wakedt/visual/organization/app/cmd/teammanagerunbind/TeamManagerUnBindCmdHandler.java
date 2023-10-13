package com.wakedt.visual.organization.app.cmd.teammanagerunbind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.team.*;

/**
 * 解绑团队管理员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
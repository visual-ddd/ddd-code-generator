package com.wakedt.visual.organization.app.cmd.teammodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.team.*;

/**
 * 编辑团队-指令处理器
 */
@Component
public class TeamModifyCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamModifyCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.teamModify(updateCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        repository.update(team);
    }
}
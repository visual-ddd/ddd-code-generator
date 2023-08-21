package com.wakedt.visual.organization.app.cmd.teamremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.team.*;

/**
 * 删除团队-指令处理器
 */
@Component
public class TeamRemoveCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamRemoveCmd removeCmd) {
        Team team = repository.find(removeCmd.getId());
        team.teamRemove(removeCmd);

        /* TODO CheckExistApplication(存在应用不能删除) 检查团队下是否存在应用 */

        /* TODO CheckExistBusinessScene(存在业务场景不能删除) 检查团队下是否存在业务场景 */

        /* TODO CheckExistDomainDesign(存在业务域不能删除) 检查团队下是否存在业务域 */

        repository.remove(team);
    }
}
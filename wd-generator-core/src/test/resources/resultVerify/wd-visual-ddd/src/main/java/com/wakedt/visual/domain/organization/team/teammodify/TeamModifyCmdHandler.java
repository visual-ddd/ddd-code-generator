package com.wakedt.visual.domain.organization.team.teammodify;

import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.domain.organization.team.TeamRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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

       // DomainEventPublisher.getInstance().postAfterCommit(new TeamModifyEvent(updateCmd));
    }
}
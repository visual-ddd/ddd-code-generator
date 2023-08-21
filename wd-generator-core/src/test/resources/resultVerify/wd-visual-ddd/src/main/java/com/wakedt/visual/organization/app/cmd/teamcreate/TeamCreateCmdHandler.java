package com.wakedt.visual.organization.app.cmd.teamcreate;

import com.wakedt.visual.organization.domain.team.Team;
import com.wakedt.visual.organization.domain.team.TeamFactory;
import com.wakedt.visual.organization.domain.team.TeamRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增团队-指令处理器
 */
@Component
public class TeamCreateCmdHandler {

    @Resource
    private TeamRepository repository;
    @Resource
    private TeamFactory factory;

    public Long handle(TeamCreateCmd createCmd) {
        Team entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        Team newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
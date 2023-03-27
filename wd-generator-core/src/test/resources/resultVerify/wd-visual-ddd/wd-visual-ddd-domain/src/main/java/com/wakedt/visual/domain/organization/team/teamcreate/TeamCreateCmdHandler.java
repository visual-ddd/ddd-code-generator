package com.wakedt.visual.domain.organization.team.teamcreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

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

        // TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复

        Team newEntity = repository.save(entity);

//        DomainEventPublisher.getInstance().postAfterCommit(new TeamCreateEvent(createCmd));
        return newEntity.getId();
    }
}
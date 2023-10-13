package com.wakedt.visual.domain.organization.team.teamcreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 新增团队-指令处理器
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
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
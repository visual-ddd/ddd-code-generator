package com.wakedt.visual.organization.app.cmd.organizationcreate;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.organization.*;

/**
 * 新增组织-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class OrganizationCreateCmdHandler {

    @Resource
    private OrganizationRepository repository;
    @Resource
    private OrganizationFactory factory;

    public Long handle(OrganizationCreateCmd createCmd) {
        Organization entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        Organization newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
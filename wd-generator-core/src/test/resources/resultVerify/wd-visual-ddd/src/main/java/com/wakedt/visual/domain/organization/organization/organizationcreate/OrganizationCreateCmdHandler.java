package com.wakedt.visual.domain.organization.organization.organizationcreate;

import com.wakedt.visual.domain.organization.organization.Organization;
import com.wakedt.visual.domain.organization.organization.OrganizationFactory;
import com.wakedt.visual.domain.organization.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增组织-指令处理器
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

       // DomainEventPublisher.getInstance().postAfterCommit(new OrganizationCreateEvent(createCmd));
        return newEntity.getId();
    }
}
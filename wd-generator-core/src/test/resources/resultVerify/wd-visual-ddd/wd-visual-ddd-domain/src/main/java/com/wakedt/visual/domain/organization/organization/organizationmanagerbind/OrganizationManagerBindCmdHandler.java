package com.wakedt.visual.domain.organization.organization.organizationmanagerbind;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 绑定组织管理员-指令处理器
 */
@Component
public class OrganizationManagerBindCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationManagerBindCmd updateCmd) {
        Organization organization = repository.find(updateCmd.getId());
        organization.organizationManagerBind(updateCmd);

        repository.update(organization);

       // DomainEventPublisher.getInstance().postAfterCommit(new OrganizationManagerBindEvent(updateCmd));
    }
}
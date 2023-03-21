package com.wakedt.visual.domain.organization.organization.remove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 删除组织-指令处理器
 */
@Component
public class OrganizationRemoveCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationRemoveCmd removeCmd) {
        Organization organization = repository.find(removeCmd.getId());
        organization.remove(removeCmd);
        repository.remove(organization);

//        DomainEventPublisher.getInstance().postAfterCommit(new OrganizationRemoveEvent(removeCmd));
    }
}
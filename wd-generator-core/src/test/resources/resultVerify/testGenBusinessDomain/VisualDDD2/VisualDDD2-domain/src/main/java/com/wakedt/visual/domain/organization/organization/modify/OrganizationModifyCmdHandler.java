package com.wakedt.visual.domain.organization.organization.modify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 编辑组织-指令处理器
 */
@Component
public class OrganizationModifyCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationModifyCmd updateCmd) {
        Organization organization = repository.find(updateCmd.getId());
        organization.modify(updateCmd);
        repository.update(organization);

//        DomainEventPublisher.getInstance().postAfterCommit(new OrganizationModifyEvent(updateCmd));
    }
}
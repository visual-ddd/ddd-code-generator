package com.wakedt.visual.organization.app.cmd.organizationremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.organization.domain.organization.*;

/**
 * 删除组织-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Component
public class OrganizationRemoveCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationRemoveCmd removeCmd) {
        Organization organization = repository.find(removeCmd.getId());
        organization.organizationRemove(removeCmd);

        /* TODO CheckExistTeam(存在团队不能删除组织) 检查组织下是否存在团队 */

        repository.remove(organization);
    }
}
package com.wakedt.visual.organization.app.cmd.organizationremove;

import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.domain.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 删除组织-指令处理器
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
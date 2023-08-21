package com.wakedt.visual.organization.app.cmd.organizationmanagerunbind;

import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.domain.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 解绑组织管理员-指令处理器
 */
@Component
public class OrganizationManagerUnbindCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationManagerUnbindCmd updateCmd) {
        Organization organization = repository.find(updateCmd.getId());
        organization.organizationManagerUnbind(updateCmd);

        repository.update(organization);
    }
}
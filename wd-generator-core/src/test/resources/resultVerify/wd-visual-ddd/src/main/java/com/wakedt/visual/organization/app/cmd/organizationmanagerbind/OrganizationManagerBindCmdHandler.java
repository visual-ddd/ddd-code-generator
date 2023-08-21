package com.wakedt.visual.organization.app.cmd.organizationmanagerbind;

import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.domain.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    }
}
package com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.organization.*;

/**
 * 绑定组织管理员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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
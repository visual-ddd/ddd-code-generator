package com.wakedt.visual.domain.organization.organization.organizationmanagerunbind;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 解绑组织管理员-指令处理器
 *
 * @author shimmer
 * @since 1.0
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
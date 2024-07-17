package com.wakedt.visual.domain.organization.organization.organizationmanagerbind;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 绑定组织管理员-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class OrganizationManagerBindCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationManagerBindCmd updateCmd) {
        log.info("绑定组织管理员-指令处理器:{}", updateCmd);

        Organization organization = repository.find(updateCmd.getId());
        organization.organizationManagerBind(updateCmd);

        repository.update(organization);

    }
}
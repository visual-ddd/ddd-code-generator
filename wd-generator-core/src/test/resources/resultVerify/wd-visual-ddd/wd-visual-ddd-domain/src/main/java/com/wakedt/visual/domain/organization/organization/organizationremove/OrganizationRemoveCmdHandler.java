package com.wakedt.visual.domain.organization.organization.organizationremove;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 删除组织-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class OrganizationRemoveCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationRemoveCmd removeCmd) {
        log.info("删除组织-指令处理器:{}", removeCmd);

        Organization organization = repository.find(removeCmd.getId());
        organization.organizationRemove(removeCmd);

        /* TODO CheckExistTeam(存在团队不能删除组织) 检查组织下是否存在团队 */

        repository.remove(organization);

    }
}
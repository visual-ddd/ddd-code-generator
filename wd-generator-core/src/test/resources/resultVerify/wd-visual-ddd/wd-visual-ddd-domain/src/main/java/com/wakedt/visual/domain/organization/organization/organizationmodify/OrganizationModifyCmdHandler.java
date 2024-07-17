package com.wakedt.visual.domain.organization.organization.organizationmodify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 编辑组织-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class OrganizationModifyCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationModifyCmd updateCmd) {
        log.info("编辑组织-指令处理器:{}", updateCmd);

        Organization organization = repository.find(updateCmd.getId());
        organization.organizationModify(updateCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        repository.update(organization);

    }
}
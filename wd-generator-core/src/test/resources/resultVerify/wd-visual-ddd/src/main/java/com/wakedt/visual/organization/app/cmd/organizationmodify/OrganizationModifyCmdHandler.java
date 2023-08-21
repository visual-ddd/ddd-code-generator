package com.wakedt.visual.organization.app.cmd.organizationmodify;

import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.domain.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 编辑组织-指令处理器
 */
@Component
public class OrganizationModifyCmdHandler {

    @Resource
    private OrganizationRepository repository;

    public void handle(OrganizationModifyCmd updateCmd) {
        Organization organization = repository.find(updateCmd.getId());
        organization.organizationModify(updateCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        repository.update(organization);
    }
}
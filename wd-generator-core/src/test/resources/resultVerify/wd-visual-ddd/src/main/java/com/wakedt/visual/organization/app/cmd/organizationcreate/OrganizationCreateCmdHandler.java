package com.wakedt.visual.organization.app.cmd.organizationcreate;

import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.domain.organization.OrganizationFactory;
import com.wakedt.visual.organization.domain.organization.OrganizationRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增组织-指令处理器
 */
@Component
public class OrganizationCreateCmdHandler {

    @Resource
    private OrganizationRepository repository;
    @Resource
    private OrganizationFactory factory;

    public Long handle(OrganizationCreateCmd createCmd) {
        Organization entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        Organization newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
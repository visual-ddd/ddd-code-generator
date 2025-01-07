package com.wakedt.visual.bizdomain.organization.app.cmd.organizationcreate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.organization.*;

/**
 * 新增组织-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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
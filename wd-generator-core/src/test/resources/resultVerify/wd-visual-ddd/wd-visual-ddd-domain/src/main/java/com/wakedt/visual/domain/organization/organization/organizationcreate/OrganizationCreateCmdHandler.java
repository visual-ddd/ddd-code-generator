package com.wakedt.visual.domain.organization.organization.organizationcreate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 新增组织-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class OrganizationCreateCmdHandler {

    @Resource
    private OrganizationRepository repository;
    @Resource
    private OrganizationFactory factory;

    public Long handle(OrganizationCreateCmd createCmd) {
        log.info("新增组织-指令处理器:{}", createCmd);

        Organization entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        Organization newEntity = repository.save(entity);

        return newEntity.getId();
    }
}
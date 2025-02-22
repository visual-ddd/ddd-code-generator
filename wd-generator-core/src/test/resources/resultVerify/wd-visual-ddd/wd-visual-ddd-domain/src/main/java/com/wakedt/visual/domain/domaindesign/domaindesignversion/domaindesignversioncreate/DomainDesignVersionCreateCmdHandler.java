package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 新增业务域版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class DomainDesignVersionCreateCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;
    @Resource
    private DomainDesignVersionFactory factory;

    public Long handle(DomainDesignVersionCreateCmd createCmd) {
        DomainDesignVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO CheckDomainVersionIdentityUnique(版本号唯一) 校验当前业务域下版本号是否唯一 */

        DomainDesignVersion newEntity = repository.save(entity);

        return newEntity.getId();
    }
}
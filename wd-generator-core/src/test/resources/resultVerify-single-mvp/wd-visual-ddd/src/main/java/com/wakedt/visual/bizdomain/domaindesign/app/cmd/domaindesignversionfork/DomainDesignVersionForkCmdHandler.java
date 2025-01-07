package com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionfork;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.*;

/**
 * Fork业务域版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class DomainDesignVersionForkCmdHandler {

    @Resource
    private DomainDesignVersionRepository repository;
    @Resource
    private DomainDesignVersionFactory factory;

    public Long handle(DomainDesignVersionForkCmd createCmd) {
        DomainDesignVersion entity = factory.getInstance(createCmd);

        /* TODO CheckDomainVersionIdentityUnique(版本号唯一) 校验当前业务域下版本号是否唯一 */

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO ForkVersion(fork新版本) 拷贝一个新版本 */

        DomainDesignVersion newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
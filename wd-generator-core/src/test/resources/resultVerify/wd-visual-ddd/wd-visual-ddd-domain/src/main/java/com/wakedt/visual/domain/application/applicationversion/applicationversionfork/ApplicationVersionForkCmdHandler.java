package com.wakedt.visual.domain.application.applicationversion.applicationversionfork;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * Fork应用版本-指令处理器
 */
@Component
public class ApplicationVersionForkCmdHandler {

    @Resource
    private ApplicationVersionRepository repository;
    @Resource
    private ApplicationVersionFactory factory;

    public Long handle(ApplicationVersionForkCmd createCmd) {
        ApplicationVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO ForkVersion(fork新版本) 拷贝一个新版本 */

        ApplicationVersion newEntity = repository.save(entity);

       // DomainEventPublisher.getInstance().postAfterCommit(new ApplicationVersionForkCmdEvent(createCmd));
        return newEntity.getId();
    }
}
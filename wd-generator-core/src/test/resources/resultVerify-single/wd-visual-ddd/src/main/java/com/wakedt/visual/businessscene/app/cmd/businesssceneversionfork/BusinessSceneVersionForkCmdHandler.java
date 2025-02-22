package com.wakedt.visual.businessscene.app.cmd.businesssceneversionfork;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.businessscene.domain.businesssceneversion.*;

/**
 * Fork业务场景版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Component
public class BusinessSceneVersionForkCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;
    @Resource
    private BusinessSceneVersionFactory factory;

    public Long handle(BusinessSceneVersionForkCmd createCmd) {
        BusinessSceneVersion entity = factory.getInstance(createCmd);

        BusinessSceneVersion newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
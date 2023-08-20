package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork;

import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersionFactory;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Fork业务场景版本-指令处理器
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

       // DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneVersionForkEvent(createCmd));
        return newEntity.getId();
    }
}
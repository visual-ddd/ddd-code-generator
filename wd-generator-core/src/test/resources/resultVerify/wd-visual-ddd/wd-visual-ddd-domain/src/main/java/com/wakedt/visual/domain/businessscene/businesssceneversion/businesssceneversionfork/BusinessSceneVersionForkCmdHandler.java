package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * Fork业务场景版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneVersionForkCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;
    @Resource
    private BusinessSceneVersionFactory factory;

    public Long handle(BusinessSceneVersionForkCmd createCmd) {
        log.info("Fork业务场景版本-指令处理器:{}", createCmd);

        BusinessSceneVersion entity = factory.getInstance(createCmd);

        BusinessSceneVersion newEntity = repository.save(entity);

        return newEntity.getId();
    }
}
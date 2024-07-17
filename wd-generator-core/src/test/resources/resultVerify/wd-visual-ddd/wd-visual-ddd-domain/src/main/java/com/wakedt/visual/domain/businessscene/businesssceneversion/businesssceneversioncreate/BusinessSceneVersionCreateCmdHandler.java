package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 新增业务场景版本-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneVersionCreateCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;
    @Resource
    private BusinessSceneVersionFactory factory;

    public Long handle(BusinessSceneVersionCreateCmd createCmd) {
        log.info("新增业务场景版本-指令处理器:{}", createCmd);

        BusinessSceneVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO CheckRepeatedBusinessSceneVersion(版本号唯一) 校验当前业务场景下版本号是否唯一 */

        BusinessSceneVersion newEntity = repository.save(entity);

        return newEntity.getId();
    }
}
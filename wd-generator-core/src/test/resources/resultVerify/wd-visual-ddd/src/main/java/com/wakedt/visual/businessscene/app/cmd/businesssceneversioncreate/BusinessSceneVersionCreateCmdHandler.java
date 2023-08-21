package com.wakedt.visual.businessscene.app.cmd.businesssceneversioncreate;

import com.wakedt.visual.businessscene.domain.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.businessscene.domain.businesssceneversion.BusinessSceneVersionFactory;
import com.wakedt.visual.businessscene.domain.businesssceneversion.BusinessSceneVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 新增业务场景版本-指令处理器
 */
@Component
public class BusinessSceneVersionCreateCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;
    @Resource
    private BusinessSceneVersionFactory factory;

    public Long handle(BusinessSceneVersionCreateCmd createCmd) {
        BusinessSceneVersion entity = factory.getInstance(createCmd);

        /* TODO CheckLegalVersion(版本号合法) 校验版本号命名是否符合标准 */

        /* TODO CheckRepeatedBusinessSceneVersion(版本号唯一) 校验当前业务场景下版本号是否唯一 */

        BusinessSceneVersion newEntity = repository.save(entity);
        return newEntity.getId();
    }
}
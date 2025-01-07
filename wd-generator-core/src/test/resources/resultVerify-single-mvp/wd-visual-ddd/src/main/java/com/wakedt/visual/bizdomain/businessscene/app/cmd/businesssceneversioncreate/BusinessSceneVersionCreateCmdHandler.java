package com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversioncreate;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.*;

/**
 * 新增业务场景版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
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
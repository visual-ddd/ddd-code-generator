package com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 删除业务场景-指令处理器
 */
@Component
public class BusinessSceneRemoveCmdHandler {

    @Resource
    private BusinessSceneRepository repository;

    public void handle(BusinessSceneRemoveCmd removeCmd) {
        BusinessScene businessScene = repository.find(removeCmd.getId());
        businessScene.businessSceneRemove(removeCmd);

        /* TODO CheckExistBusinessSceneVersion(存在版本不能删除) 校验当前业务场景下是否存在版本 */

        repository.remove(businessScene);

       // DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneRemoveEvent(removeCmd));
    }
}
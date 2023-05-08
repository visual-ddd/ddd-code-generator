package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 编辑业务场景-指令处理器
 */
@Component
public class BusinessSceneModifyCmdHandler {

    @Resource
    private BusinessSceneRepository repository;

    public void handle(BusinessSceneModifyCmd updateCmd) {
        BusinessScene businessScene = repository.find(updateCmd.getId());
        businessScene.businessSceneModify(updateCmd);

        repository.update(businessScene);

        // DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneModifyEvent(createCmd));
    }
}
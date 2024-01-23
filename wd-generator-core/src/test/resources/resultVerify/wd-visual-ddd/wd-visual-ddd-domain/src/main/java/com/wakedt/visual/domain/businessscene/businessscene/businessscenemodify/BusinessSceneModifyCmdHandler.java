package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 编辑业务场景-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class BusinessSceneModifyCmdHandler {

    @Resource
    private BusinessSceneRepository repository;

    public void handle(BusinessSceneModifyCmd updateCmd) {
        BusinessScene businessScene = repository.find(updateCmd.getId());
        businessScene.businessSceneModify(updateCmd);

        repository.update(businessScene);

        // TODO 根据业务需要，发布<编辑业务场景>领域事件
        DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneModifyEvent());
    }
}
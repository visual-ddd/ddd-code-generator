package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import com.wakedata.common.domainevent.DomainEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 编辑业务场景-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneModifyCmdHandler {

    @Resource
    private BusinessSceneRepository repository;

    public void handle(BusinessSceneModifyCmd updateCmd) {
        log.info("编辑业务场景-指令处理器:{}", updateCmd);

        BusinessScene businessScene = repository.find(updateCmd.getId());
        businessScene.businessSceneModify(updateCmd);

        repository.update(businessScene);

        // TODO 根据业务需要，发布<编辑业务场景>领域事件
        DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneModifyEvent());
    }
}
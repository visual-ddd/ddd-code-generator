package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 发布业务场景版本-指令处理器
 */
@Component
public class BusinessSceneVersionPublishCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;

    public void handle(BusinessSceneVersionPublishCmd updateCmd) {
        BusinessSceneVersion businessSceneVersion = repository.find(updateCmd.getId());
        businessSceneVersion.businessSceneVersionPublish(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(businessSceneVersion);

       // DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneVersionPublishEvent(updateCmd));
    }
}
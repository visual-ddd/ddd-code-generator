package com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate;

import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 更新业务场景DSL-指令处理器
 */
@Component
public class BusinessSceneVersionDSLUpdateCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;

    public void handle(BusinessSceneVersionDSLUpdateCmd updateCmd) {
        BusinessSceneVersion businessSceneVersion = repository.find(updateCmd.getId());
        businessSceneVersion.dslUpdate(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(businessSceneVersion);

       // DomainEventPublisher.getInstance().postAfterCommit(new BusinessSceneVersionDSLUpdateEvent(updateCmd));
    }
}
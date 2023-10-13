package com.wakedt.visual.businessscene.app.cmd.businesssceneversionremove;

import com.wakedata.common.domainevent.DomainEventPublisher;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.businessscene.domain.businesssceneversion.*;

/**
 * 删除业务场景版本-指令处理器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class BusinessSceneVersionRemoveCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;

    public void handle(BusinessSceneVersionRemoveCmd removeCmd) {
        BusinessSceneVersion businessSceneVersion = repository.find(removeCmd.getId());
        businessSceneVersion.businessSceneVersionRemove(removeCmd);

        /* TODO CheckBsVersionBindApplication(关联状态禁止删除) 业务场景被应用绑定时，不允许删除 */

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.remove(businessSceneVersion);
    }
}
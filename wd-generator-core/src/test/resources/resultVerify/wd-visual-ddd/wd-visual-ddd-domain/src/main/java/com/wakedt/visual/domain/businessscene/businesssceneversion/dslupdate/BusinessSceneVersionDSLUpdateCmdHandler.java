package com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 更新业务场景DSL-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneVersionDSLUpdateCmdHandler {

    @Resource
    private BusinessSceneVersionRepository repository;

    public void handle(BusinessSceneVersionDSLUpdateCmd updateCmd) {
        log.info("更新业务场景DSL-指令处理器:{}", updateCmd);

        BusinessSceneVersion businessSceneVersion = repository.find(updateCmd.getId());
        businessSceneVersion.dslUpdate(updateCmd);

        /* TODO CheckVersionPublishedException(发布锁定) 当前版本发布后不能再进行任何操作 */

        repository.update(businessSceneVersion);

    }
}
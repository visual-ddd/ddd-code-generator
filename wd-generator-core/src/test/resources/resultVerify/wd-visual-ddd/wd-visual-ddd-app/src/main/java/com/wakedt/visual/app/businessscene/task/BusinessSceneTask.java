package com.wakedt.visual.app.businessscene.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmdHandler;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove.BusinessSceneRemoveCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate.BusinessSceneVersionCreateCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove.BusinessSceneVersionRemoveCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate.BusinessSceneVersionDSLUpdateCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish.BusinessSceneVersionPublishCmdHandler;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork.BusinessSceneVersionForkCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * BusinessScene-定时任务
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class BusinessSceneTask {

    @Resource
    private BusinessSceneModifyCmdHandler businessSceneModifyCmdHandler;

    /**
     * 定时执行 编辑业务场景
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void pointEffectiveCheckTask() {
        log.info("编辑业务场景-定时执行");

        // TODO 执行编辑业务场景
        businessSceneModifyCmdHandler.handle(null);
    }
}
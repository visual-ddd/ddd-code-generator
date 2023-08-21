package com.wakedt.visual.businessscene.app.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.businessscene.app.cmd.businessscenecreate.BusinessSceneCreateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversioncreate.BusinessSceneVersionCreateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionmodify.BusinessSceneVersionModifyCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionremove.BusinessSceneVersionRemoveCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.dslupdate.BusinessSceneVersionDSLUpdateCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionpublish.BusinessSceneVersionPublishCmdHandler;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionfork.BusinessSceneVersionForkCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * BusinessScene - 定时任务
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
        // TODO 执行编辑业务场景
        businessSceneModifyCmdHandler.handle(null);
    }
}
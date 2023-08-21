package com.wakedt.visual.businessscene.app.task;

import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmdHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
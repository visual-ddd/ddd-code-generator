package com.wakedt.visual.businessscene.app.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
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
import com.wakedt.visual.businessscene.app.consumer.event.BusinessSceneCreateEvent;

import javax.annotation.Resource;

/**
 * BusinessScene - 事件订阅
 */
@Slf4j
@Component
public class BusinessSceneListener {

    @Resource
    private BusinessSceneModifyCmdHandler businessSceneModifyCmdHandler;

    /**
     * 消费事件 编辑业务场景
     */
    @DomainEventSubscribe
    public void listenBusinessSceneCreateEvent(BusinessSceneCreateEvent event){
        // TODO 执行编辑业务场景
        businessSceneModifyCmdHandler.handle(null);
    }
}
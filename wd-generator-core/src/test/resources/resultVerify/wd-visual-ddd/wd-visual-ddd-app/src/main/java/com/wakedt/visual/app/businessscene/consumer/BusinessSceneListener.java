package com.wakedt.visual.app.businessscene.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
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
import com.wakedt.visual.app.businessscene.consumer.event.BusinessSceneCreateEvent;

import javax.annotation.Resource;

/**
 * BusinessScene-事件订阅
 *
 * @author shimmer
 * @since 1.0
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
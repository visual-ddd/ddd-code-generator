package com.wakedt.visual.businessscene.app.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmdHandler;
import com.wakedt.visual.businessscene.app.consumer.event.BusinessSceneCreateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
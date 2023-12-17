package com.wakedt.visual.app.businessscene.consumer;

import com.wakedt.visual.app.businessscene.consumer.event.BusinessSceneCreateEvent;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmdHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
    public void listenBusinessSceneCreateEvent(BusinessSceneCreateEvent event){
        // TODO 执行编辑业务场景
        businessSceneModifyCmdHandler.handle(null);
    }
}
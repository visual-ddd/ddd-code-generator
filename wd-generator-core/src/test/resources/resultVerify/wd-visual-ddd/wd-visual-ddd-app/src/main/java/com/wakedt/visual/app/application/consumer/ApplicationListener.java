package com.wakedt.visual.app.application.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.application.application.applicationcreate.ApplicationCreateCmdHandler;
import com.wakedt.visual.domain.application.application.applicationmodify.ApplicationModifyCmdHandler;
import com.wakedt.visual.domain.application.application.applicationremove.ApplicationRemoveCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.applicationversioncreate.ApplicationVersionCreateCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.applicationversionmodify.ApplicationVersionModifyCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.applicationversionremove.ApplicationVersionRemoveCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind.BusinessSceneVersionBindCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind.DomainDesignVersionBindCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.applicationversionpublish.ApplicationVersionPublishCmdHandler;
import com.wakedt.visual.domain.application.applicationversion.applicationversionfork.ApplicationVersionForkCmdHandler;

import javax.annotation.Resource;

/**
 * Application-事件订阅
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class ApplicationListener {

}
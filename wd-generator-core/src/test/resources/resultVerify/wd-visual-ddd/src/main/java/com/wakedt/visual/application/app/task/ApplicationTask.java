package com.wakedt.visual.application.app.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.application.app.cmd.applicationcreate.ApplicationCreateCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationmodify.ApplicationModifyCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationremove.ApplicationRemoveCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmdHandler;
import com.wakedt.visual.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmdHandler;
import com.wakedt.visual.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmdHandler;
import com.wakedt.visual.application.app.cmd.applicationversionfork.ApplicationVersionForkCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Application - 定时任务
 */
@Slf4j
@Component
public class ApplicationTask {

}
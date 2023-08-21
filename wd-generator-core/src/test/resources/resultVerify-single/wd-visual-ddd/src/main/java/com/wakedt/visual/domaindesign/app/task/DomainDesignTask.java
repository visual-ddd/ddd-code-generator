package com.wakedt.visual.domaindesign.app.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmdHandler;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * DomainDesign - 定时任务
 */
@Slf4j
@Component
public class DomainDesignTask {

}
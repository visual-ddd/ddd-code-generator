package com.wakedt.visual.domaindesign.app.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
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

/**
 * DomainDesign - 事件订阅
 */
@Slf4j
@Component
public class DomainDesignListener {

}
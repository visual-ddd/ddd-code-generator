package com.wakedt.visual.app.domaindesign.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate.DomainDesignCreateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify.DomainDesignModifyCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate.DomainDesignVersionCreateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify.DomainDesignVersionModifyCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove.DomainDesignVersionRemoveCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate.DomainDesignDslUpdateCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish.DomainDesignVersionPublishCmdHandler;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork.DomainDesignVersionForkCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * DomainDesign-定时任务
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Slf4j
@Component
public class DomainDesignTask {

}
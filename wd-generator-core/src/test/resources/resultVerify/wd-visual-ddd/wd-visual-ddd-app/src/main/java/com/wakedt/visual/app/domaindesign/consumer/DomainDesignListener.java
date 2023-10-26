package com.wakedt.visual.app.domaindesign.consumer;

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

/**
 * DomainDesign-事件订阅
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class DomainDesignListener {

}
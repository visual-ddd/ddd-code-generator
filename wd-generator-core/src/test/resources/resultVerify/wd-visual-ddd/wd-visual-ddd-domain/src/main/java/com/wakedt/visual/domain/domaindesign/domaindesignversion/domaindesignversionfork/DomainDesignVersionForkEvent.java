package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * Fork业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionForkEvent extends BaseDomainEvent {
    
    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;
    
    public DomainDesignVersionForkEvent() {}

    public DomainDesignVersionForkEvent(DomainDesignVersionForkCmd cmd
    ) {
        this.startVersionId = cmd.getStartVersionId();
        this.currentVersion = cmd.getCurrentVersion();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork}";
    }
}

package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 更新业务域DSL-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignDslUpdateEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;

    /** 业务域DSL */
    private String domainDesignDsl;

    /** 图形DSL */
    private String graphDsl;
    
    public DomainDesignDslUpdateEvent() {}

    public DomainDesignDslUpdateEvent(DomainDesignDslUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.domainDesignDsl = cmd.getDomainDesignDsl();
        this.graphDsl = cmd.getGraphDsl();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate}";
    }
}

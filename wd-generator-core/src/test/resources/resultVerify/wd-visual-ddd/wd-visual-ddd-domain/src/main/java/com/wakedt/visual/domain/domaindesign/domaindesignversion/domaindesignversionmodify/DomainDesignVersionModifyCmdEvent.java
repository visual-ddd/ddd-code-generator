package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 编辑业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionModifyCmdEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;

    /** 描述 */
    private String description;
    
    public DomainDesignVersionModifyCmdEvent() {}

    public DomainDesignVersionModifyCmdEvent(DomainDesignVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify}";
    }
}

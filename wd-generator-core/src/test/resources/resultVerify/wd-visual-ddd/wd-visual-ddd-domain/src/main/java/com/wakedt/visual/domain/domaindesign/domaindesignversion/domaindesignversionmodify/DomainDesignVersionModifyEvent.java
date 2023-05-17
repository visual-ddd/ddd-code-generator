package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 编辑业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionModifyEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;

    /** 描述 */
    private String description;
    
    public DomainDesignVersionModifyEvent() {}

    public DomainDesignVersionModifyEvent(DomainDesignVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify}";
    }
}

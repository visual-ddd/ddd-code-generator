package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 删除业务域-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignRemoveEvent extends BaseDomainEvent {
    
    /** 业务域 ID */
    private Long id;
    
    public DomainDesignRemoveEvent() {}

    public DomainDesignRemoveEvent(DomainDesignRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove}";
    }
}

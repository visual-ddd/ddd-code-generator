package com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * 关联业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionBindEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 关联业务域列表 */
    private Set<Long> domainDesignVersionIds;
    
    public DomainDesignVersionBindEvent() {}

    public DomainDesignVersionBindEvent(DomainDesignVersionBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.domainDesignVersionIds = cmd.getDomainDesignVersionIds();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind}";
    }
}

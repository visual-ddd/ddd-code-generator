package com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionBindEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 当前应用关联的业务域版本ID列表 */
    private Set<Long> domainDesignVersionIds;
    
    public DomainDesignVersionBindEvent() {}

    public DomainDesignVersionBindEvent(DomainDesignVersionBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.domainDesignVersionIds = cmd.getDomainDesignVersionIds();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

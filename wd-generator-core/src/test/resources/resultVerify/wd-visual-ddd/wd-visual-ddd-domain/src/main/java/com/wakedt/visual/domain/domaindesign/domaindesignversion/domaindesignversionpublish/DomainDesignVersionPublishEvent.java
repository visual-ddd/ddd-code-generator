package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionPublishEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;
    
    public DomainDesignVersionPublishEvent() {}

    public DomainDesignVersionPublishEvent(DomainDesignVersionPublishCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

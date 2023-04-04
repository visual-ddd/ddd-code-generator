package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 删除业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionRemoveEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;
    
    public DomainDesignVersionRemoveEvent() {}

    public DomainDesignVersionRemoveEvent(DomainDesignVersionRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

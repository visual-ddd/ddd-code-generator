package com.wakedt.visual.domain.organization.organization.organizationmanagerunbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrganizationManagerUnbindEvent extends BaseDomainEvent {
    
    /** 组织 ID */
    private Long id;
    
    public OrganizationManagerUnbindEvent() {}

    public OrganizationManagerUnbindEvent(OrganizationManagerUnbindCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

package com.wakedt.visual.domain.organization.organization.organizationmanagerunbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 解绑组织管理员-指令事件
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
        return "${event.com.wakedt.visual.domain.organization.organization.organizationmanagerunbind}";
    }
}

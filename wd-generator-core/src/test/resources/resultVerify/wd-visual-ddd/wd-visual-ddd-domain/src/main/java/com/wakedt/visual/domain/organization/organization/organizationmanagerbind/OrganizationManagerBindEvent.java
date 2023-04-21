package com.wakedt.visual.domain.organization.organization.organizationmanagerbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 绑定组织管理员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrganizationManagerBindEvent extends BaseDomainEvent {
    
    /** 组织 ID */
    private Long id;

    /** 组织管理员 */
    private Long organizationManagerId;
    
    public OrganizationManagerBindEvent() {}

    public OrganizationManagerBindEvent(OrganizationManagerBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.organizationManagerId = cmd.getOrganizationManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.organization.organizationmanagerbind}";
    }
}

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

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationManagerId;
    
    public OrganizationManagerBindEvent() {}

    public OrganizationManagerBindEvent(OrganizationManagerBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.organizationManagerId = cmd.getOrganizationManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

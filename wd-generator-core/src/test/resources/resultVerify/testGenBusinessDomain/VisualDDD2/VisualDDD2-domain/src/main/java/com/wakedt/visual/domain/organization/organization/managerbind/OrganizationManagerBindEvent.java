package com.wakedt.visual.domain.organization.organization.managerbind;

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
public class OrganizationManagerBindEvent extends BaseDomainEvent {
    
    /** 组织 ID */
    private Long id;

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationTeamManagerId;
    
    public OrganizationManagerBindEvent() {}

    public OrganizationManagerBindEvent(OrganizationManagerBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.organizationTeamManagerId = cmd.getOrganizationTeamManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

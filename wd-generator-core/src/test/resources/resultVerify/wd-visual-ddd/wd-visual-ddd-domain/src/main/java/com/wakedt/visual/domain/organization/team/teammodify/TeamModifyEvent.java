package com.wakedt.visual.domain.organization.team.teammodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.organization.team.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamModifyEvent extends BaseDomainEvent {
    
    /** 团队 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织唯一标识 */
    private Long organizationId;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;
    
    public TeamModifyEvent() {}

    public TeamModifyEvent(TeamModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.name = cmd.getName();
        this.description = cmd.getDescription();
        this.organizationId = cmd.getOrganizationId();
        this.teamManagerId = cmd.getTeamManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

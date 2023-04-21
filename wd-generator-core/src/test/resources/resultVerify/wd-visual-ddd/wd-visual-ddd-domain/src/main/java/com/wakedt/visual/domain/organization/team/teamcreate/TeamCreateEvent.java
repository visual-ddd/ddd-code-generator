package com.wakedt.visual.domain.organization.team.teamcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 新增团队-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamCreateEvent extends BaseDomainEvent {
    
    /** 团队 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;
    
    public TeamCreateEvent() {}

    public TeamCreateEvent(TeamCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.name = cmd.getName();
        this.description = cmd.getDescription();
        this.organizationId = cmd.getOrganizationId();
        this.teamManagerId = cmd.getTeamManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.team.teamcreate}";
    }
}

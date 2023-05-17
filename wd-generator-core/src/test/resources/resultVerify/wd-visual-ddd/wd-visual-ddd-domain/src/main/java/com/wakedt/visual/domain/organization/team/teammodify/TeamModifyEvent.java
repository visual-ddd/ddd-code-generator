package com.wakedt.visual.domain.organization.team.teammodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 编辑团队-指令事件
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

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
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
        return "${event.com.wakedt.visual.domain.organization.team.teammodify}";
    }
}

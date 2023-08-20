package com.wakedt.visual.domain.organization.organization.organizationcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增组织-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrganizationCreateEvent extends BaseDomainEvent {
    
    /** 组织 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;
    
    public OrganizationCreateEvent() {}

    public OrganizationCreateEvent(OrganizationCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.name = cmd.getName();
        this.description = cmd.getDescription();
        this.organizationManagerId = cmd.getOrganizationManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.organization.organizationcreate}";
    }
}

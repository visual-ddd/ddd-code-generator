package com.wakedt.visual.domain.organization.organization.organizationmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.organization.*;

/**
 * 编辑组织-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrganizationModifyCmdEvent extends BaseDomainEvent {
    
    /** 组织 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;
    
    public OrganizationModifyCmdEvent() {}

    public OrganizationModifyCmdEvent(OrganizationModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.name = cmd.getName();
        this.description = cmd.getDescription();
        this.organizationManagerId = cmd.getOrganizationManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.organization.organizationmodify}";
    }
}

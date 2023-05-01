package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 删除团队成员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamMemberRemoveCmdEvent extends BaseDomainEvent {
    
    /** 团队成员ID */
    private Long id;
    
    public TeamMemberRemoveCmdEvent() {}

    public TeamMemberRemoveCmdEvent(TeamMemberRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.teammember.teammemberremove}";
    }
}

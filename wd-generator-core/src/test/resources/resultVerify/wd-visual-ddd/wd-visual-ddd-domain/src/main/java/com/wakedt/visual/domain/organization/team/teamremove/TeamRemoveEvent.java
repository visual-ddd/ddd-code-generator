package com.wakedt.visual.domain.organization.team.teamremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 删除团队-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamRemoveEvent extends BaseDomainEvent {
    
    /** 团队 ID */
    private Long id;
    
    public TeamRemoveEvent() {}

    public TeamRemoveEvent(TeamRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.team.teamremove}";
    }
}

package com.wakedt.visual.domain.organization.team.teammanagerunbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 解绑团队管理员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamManagerUnBindEvent extends BaseDomainEvent {
    
    /** 主键 */
    private Long id;
    
    public TeamManagerUnBindEvent() {}

    public TeamManagerUnBindEvent(TeamManagerUnBindCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.team.teammanagerunbind}";
    }
}

package com.wakedt.visual.domain.organization.team.teammanagerbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 绑定团队管理员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamManagerBindEvent extends BaseDomainEvent {
    
    /** 团队 ID */
    private Long id;

    /** 团队管理员 */
    private Long teamManagerId;
    
    public TeamManagerBindEvent() {}

    public TeamManagerBindEvent(TeamManagerBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.teamManagerId = cmd.getTeamManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.team.teammanagerbind}";
    }
}

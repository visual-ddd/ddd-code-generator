package com.wakedt.visual.domain.organization.team.teammanagerbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 绑定团队管理员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamManagerBindEvent extends BaseDomainEvent {
    
    /** 团队 ID */
    private Long id;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;
    
    public TeamManagerBindEvent() {}

    public TeamManagerBindEvent(TeamManagerBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.teamManagerId = cmd.getTeamManagerId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

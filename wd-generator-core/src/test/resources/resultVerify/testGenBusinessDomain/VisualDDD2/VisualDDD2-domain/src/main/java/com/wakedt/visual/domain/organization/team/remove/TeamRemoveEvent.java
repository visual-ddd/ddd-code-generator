package com.wakedt.visual.domain.organization.team.remove;

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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

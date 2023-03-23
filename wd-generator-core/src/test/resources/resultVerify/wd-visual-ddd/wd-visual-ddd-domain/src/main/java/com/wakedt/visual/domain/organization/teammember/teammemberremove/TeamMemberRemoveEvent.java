package com.wakedt.visual.domain.organization.teammember.teammemberremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamMemberRemoveEvent extends BaseDomainEvent {
    
    /** 团队成员ID */
    private Long id;
    
    public TeamMemberRemoveEvent() {}

    public TeamMemberRemoveEvent(TeamMemberRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

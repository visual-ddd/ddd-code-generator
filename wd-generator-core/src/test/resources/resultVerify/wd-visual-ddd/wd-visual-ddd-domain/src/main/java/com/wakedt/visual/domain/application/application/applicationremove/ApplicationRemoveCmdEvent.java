package com.wakedt.visual.domain.application.application.applicationremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.application.*;

/**
 * 删除应用-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationRemoveCmdEvent extends BaseDomainEvent {
    
    /** 应用 ID */
    private Long id;
    
    public ApplicationRemoveCmdEvent() {}

    public ApplicationRemoveCmdEvent(ApplicationRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.application.applicationremove}";
    }
}

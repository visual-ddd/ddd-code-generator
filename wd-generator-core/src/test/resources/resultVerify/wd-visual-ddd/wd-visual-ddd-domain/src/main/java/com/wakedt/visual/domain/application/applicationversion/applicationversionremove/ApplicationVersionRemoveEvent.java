package com.wakedt.visual.domain.application.applicationversion.applicationversionremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 删除应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionRemoveEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;
    
    public ApplicationVersionRemoveEvent() {}

    public ApplicationVersionRemoveEvent(ApplicationVersionRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

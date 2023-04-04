package com.wakedt.visual.domain.application.application.applicationremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.application.application.*;

/**
 * 删除应用-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationRemoveEvent extends BaseDomainEvent {
    
    /** 应用 ID */
    private Long id;
    
    public ApplicationRemoveEvent() {}

    public ApplicationRemoveEvent(ApplicationRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

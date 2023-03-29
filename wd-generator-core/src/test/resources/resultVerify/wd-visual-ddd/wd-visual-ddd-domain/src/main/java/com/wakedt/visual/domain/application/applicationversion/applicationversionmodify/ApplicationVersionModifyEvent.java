package com.wakedt.visual.domain.application.applicationversion.applicationversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionModifyEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 描述信息 */
    private String description;
    
    public ApplicationVersionModifyEvent() {}

    public ApplicationVersionModifyEvent(ApplicationVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

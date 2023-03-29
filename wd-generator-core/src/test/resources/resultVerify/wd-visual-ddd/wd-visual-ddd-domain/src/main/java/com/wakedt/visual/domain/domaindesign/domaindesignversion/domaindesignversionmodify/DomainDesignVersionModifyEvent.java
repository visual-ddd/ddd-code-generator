package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionModifyEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;

    /** 描述信息 */
    private String description;
    
    public DomainDesignVersionModifyEvent() {}

    public DomainDesignVersionModifyEvent(DomainDesignVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

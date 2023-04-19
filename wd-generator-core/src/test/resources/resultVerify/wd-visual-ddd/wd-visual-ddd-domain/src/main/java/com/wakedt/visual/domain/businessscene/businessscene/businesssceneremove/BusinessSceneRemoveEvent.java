package com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 删除业务场景-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneRemoveEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;
    
    public BusinessSceneRemoveEvent() {}

    public BusinessSceneRemoveEvent(BusinessSceneRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

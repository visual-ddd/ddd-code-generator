package com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 关联业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionBindEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 当前应用关联的业务场景版本ID列表 */
    private Set<Long> businessSceneVersionIds;
    
    public BusinessSceneVersionBindEvent() {}

    public BusinessSceneVersionBindEvent(BusinessSceneVersionBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.businessSceneVersionIds = cmd.getBusinessSceneVersionIds();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

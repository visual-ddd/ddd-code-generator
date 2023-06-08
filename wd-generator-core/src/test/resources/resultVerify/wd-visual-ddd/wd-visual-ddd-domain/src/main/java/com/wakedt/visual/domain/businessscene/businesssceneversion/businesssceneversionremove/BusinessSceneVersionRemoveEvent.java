package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 删除业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionRemoveEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;
    
    public BusinessSceneVersionRemoveEvent() {}

    public BusinessSceneVersionRemoveEvent(BusinessSceneVersionRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove}";
    }
}

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
public class BusinessSceneRemoveCmdEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;
    
    public BusinessSceneRemoveCmdEvent() {}

    public BusinessSceneRemoveCmdEvent(BusinessSceneRemoveCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove}";
    }
}

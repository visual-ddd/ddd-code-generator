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
public class BusinessSceneVersionBindCmdEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 关联业务场景列表 */
    private Set<Long> businessSceneVersionIds;
    
    public BusinessSceneVersionBindCmdEvent() {}

    public BusinessSceneVersionBindCmdEvent(BusinessSceneVersionBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.businessSceneVersionIds = cmd.getBusinessSceneVersionIds();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind}";
    }
}

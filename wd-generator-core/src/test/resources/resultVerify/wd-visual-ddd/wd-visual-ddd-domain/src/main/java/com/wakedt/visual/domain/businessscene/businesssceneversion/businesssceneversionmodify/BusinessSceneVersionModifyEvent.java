package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 编辑业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionModifyEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 描述 */
    private String description;
    
    public BusinessSceneVersionModifyEvent() {}

    public BusinessSceneVersionModifyEvent(BusinessSceneVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify}";
    }
}

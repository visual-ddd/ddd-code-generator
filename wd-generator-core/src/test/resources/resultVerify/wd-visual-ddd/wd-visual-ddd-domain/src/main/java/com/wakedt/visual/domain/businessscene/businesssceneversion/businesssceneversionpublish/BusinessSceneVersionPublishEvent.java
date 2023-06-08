package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 发布业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionPublishEvent extends BaseDomainEvent {
    
    /** 业务场景版本ID */
    private Long id;
    
    public BusinessSceneVersionPublishEvent() {}

    public BusinessSceneVersionPublishEvent(BusinessSceneVersionPublishCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish}";
    }
}

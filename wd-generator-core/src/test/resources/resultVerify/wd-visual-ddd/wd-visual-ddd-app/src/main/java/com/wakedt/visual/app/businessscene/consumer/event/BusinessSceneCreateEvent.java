package com.wakedt.visual.app.businessscene.consumer.event;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.EqualsAndHashCode;

/**
 * 外部事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneCreateEvent extends BaseDomainEvent {

    public BusinessSceneCreateEvent() {
        // TODO 添加外部事件属性字段

    }

    @Override
    public String eventCode() {
        return "${}";
    }
}
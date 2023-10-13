package com.wakedt.visual.businessscene.app.consumer.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 外部事件
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneCreateEvent extends BaseDomainEvent {

    // TODO 添加外部事件属性字段
    private String name;


    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.businessscene.app.consumer.event}";
    }

}
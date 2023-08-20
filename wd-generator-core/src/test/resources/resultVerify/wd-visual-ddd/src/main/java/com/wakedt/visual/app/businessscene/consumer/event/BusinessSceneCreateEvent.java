package com.wakedt.visual.app.businessscene.consumer.event;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 外部事件
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
        return "${event.com.wakedt.visual.app.businessscene.consumer.event}";
    }

}
package com.wakedt.visual.domain.application.applicationversion.applicationversionpublish;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 发布应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionPublishEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;
    
    public ApplicationVersionPublishEvent() {}

    public ApplicationVersionPublishEvent(ApplicationVersionPublishCmd cmd
    ) {
        this.id = cmd.getId();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.applicationversion.applicationversionpublish}";
    }
}

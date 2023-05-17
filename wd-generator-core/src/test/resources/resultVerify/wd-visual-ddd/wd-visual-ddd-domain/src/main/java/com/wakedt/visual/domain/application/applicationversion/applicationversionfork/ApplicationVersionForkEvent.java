package com.wakedt.visual.domain.application.applicationversion.applicationversionfork;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Fork应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionForkEvent extends BaseDomainEvent {
    
    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;
    
    public ApplicationVersionForkEvent() {}

    public ApplicationVersionForkEvent(ApplicationVersionForkCmd cmd
    ) {
        this.startVersionId = cmd.getStartVersionId();
        this.currentVersion = cmd.getCurrentVersion();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.applicationversion.applicationversionfork}";
    }
}

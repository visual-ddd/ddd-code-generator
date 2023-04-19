package com.wakedt.visual.domain.application.applicationversion.applicationversionfork;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * Fork应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionForkEvent extends BaseDomainEvent {
    
    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

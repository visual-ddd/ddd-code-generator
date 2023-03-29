package com.wakedt.visual.domain.application.applicationversion.applicationversioncreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionCreateEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 应用的唯一标识 */
    private Long applicationId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;
    
    public ApplicationVersionCreateEvent() {}

    public ApplicationVersionCreateEvent(ApplicationVersionCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.applicationId = cmd.getApplicationId();
        this.startVersion = cmd.getStartVersion();
        this.currentVersion = cmd.getCurrentVersion();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

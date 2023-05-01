package com.wakedt.visual.domain.application.applicationversion.applicationversioncreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 新增应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionCreateCmdEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 应用ID */
    private Long applicationId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;
    
    public ApplicationVersionCreateCmdEvent() {}

    public ApplicationVersionCreateCmdEvent(ApplicationVersionCreateCmd cmd
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
        return "${event.com.wakedt.visual.domain.application.applicationversion.applicationversioncreate}";
    }
}

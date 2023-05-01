package com.wakedt.visual.domain.application.applicationversion.applicationversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.applicationversion.*;

/**
 * 编辑应用版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationVersionModifyCmdEvent extends BaseDomainEvent {
    
    /** 应用版本ID */
    private Long id;

    /** 描述 */
    private String description;
    
    public ApplicationVersionModifyCmdEvent() {}

    public ApplicationVersionModifyCmdEvent(ApplicationVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.applicationversion.applicationversionmodify}";
    }
}

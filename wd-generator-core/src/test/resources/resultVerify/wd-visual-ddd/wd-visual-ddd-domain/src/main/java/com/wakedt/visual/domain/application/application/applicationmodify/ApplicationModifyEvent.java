package com.wakedt.visual.domain.application.application.applicationmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.application.application.*;

/**
 * 编辑应用-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationModifyEvent extends BaseDomainEvent {
    
    /** 应用 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;
    
    public ApplicationModifyEvent() {}

    public ApplicationModifyEvent(ApplicationModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.name = cmd.getName();
        this.packageName = cmd.getPackageName();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.application.applicationmodify}";
    }
}

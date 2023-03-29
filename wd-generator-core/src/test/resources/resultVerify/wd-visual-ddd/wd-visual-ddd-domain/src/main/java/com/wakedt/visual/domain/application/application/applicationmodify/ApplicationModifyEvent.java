package com.wakedt.visual.domain.application.application.applicationmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.application.application.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationModifyEvent extends BaseDomainEvent {
    
    /** 应用 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 生成项目时的包结构 */
    private String packageName;

    /** 描述信息 */
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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

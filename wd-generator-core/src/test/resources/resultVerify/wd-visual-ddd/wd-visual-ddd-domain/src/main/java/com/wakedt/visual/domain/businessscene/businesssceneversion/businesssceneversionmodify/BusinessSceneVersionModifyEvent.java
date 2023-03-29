package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * $CMD_EVENT_CLASS_DESCRIPTION-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionModifyEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 描述信息 */
    private String description;
    
    public BusinessSceneVersionModifyEvent() {}

    public BusinessSceneVersionModifyEvent(BusinessSceneVersionModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * Fork业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionForkCmdEvent extends BaseDomainEvent {
    
    /** 基版本的唯一标识 */
    private Long startVersionId;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;
    
    public BusinessSceneVersionForkCmdEvent() {}

    public BusinessSceneVersionForkCmdEvent(BusinessSceneVersionForkCmd cmd
    ) {
        this.startVersionId = cmd.getStartVersionId();
        this.currentVersion = cmd.getCurrentVersion();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork}";
    }
}

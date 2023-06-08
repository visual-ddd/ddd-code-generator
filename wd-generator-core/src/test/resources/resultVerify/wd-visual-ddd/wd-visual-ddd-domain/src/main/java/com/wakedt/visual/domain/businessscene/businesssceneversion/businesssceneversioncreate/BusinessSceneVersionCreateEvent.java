package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 新增业务场景版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionCreateEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 业务场景ID */
    private Long businessSceneId;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;
    
    public BusinessSceneVersionCreateEvent() {}

    public BusinessSceneVersionCreateEvent(BusinessSceneVersionCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.businessSceneId = cmd.getBusinessSceneId();
        this.description = cmd.getDescription();
        this.startVersion = cmd.getStartVersion();
        this.currentVersion = cmd.getCurrentVersion();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate}";
    }
}

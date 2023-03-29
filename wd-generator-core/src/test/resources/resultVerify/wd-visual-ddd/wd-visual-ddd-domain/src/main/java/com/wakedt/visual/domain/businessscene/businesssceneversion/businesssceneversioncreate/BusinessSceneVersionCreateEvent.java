package com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate;

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
public class BusinessSceneVersionCreateEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 业务场景的唯一标识 */
    private Long businessSceneId;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

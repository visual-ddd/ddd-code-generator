package com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.businessscene.businesssceneversion.*;

/**
 * 更新业务场景DSL-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneVersionDSLUpdateEvent extends BaseDomainEvent {
    
    /** 业务场景版本ID */
    private Long id;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;

    /** 业务场景抽象文本描述语言 */
    private String businessSceneDsl;
    
    public BusinessSceneVersionDSLUpdateEvent() {}

    public BusinessSceneVersionDSLUpdateEvent(BusinessSceneVersionDSLUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.graphDsl = cmd.getGraphDsl();
        this.businessSceneDsl = cmd.getBusinessSceneDsl();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

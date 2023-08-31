package com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 编辑业务场景-指令事件
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneModifyEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;
    
    public BusinessSceneModifyEvent() {}

    public BusinessSceneModifyEvent(BusinessSceneModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.name = cmd.getName();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify}";
    }
}

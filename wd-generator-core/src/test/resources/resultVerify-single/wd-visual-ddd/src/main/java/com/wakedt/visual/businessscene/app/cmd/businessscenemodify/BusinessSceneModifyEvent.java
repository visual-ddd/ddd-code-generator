package com.wakedt.visual.businessscene.app.cmd.businessscenemodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.businessscene.domain.businessscene.*;

/**
 * 编辑业务场景-指令事件
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
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
        return "${event.com.wakedt.visual.businessscene.app.cmd.businessscenemodify}";
    }
}

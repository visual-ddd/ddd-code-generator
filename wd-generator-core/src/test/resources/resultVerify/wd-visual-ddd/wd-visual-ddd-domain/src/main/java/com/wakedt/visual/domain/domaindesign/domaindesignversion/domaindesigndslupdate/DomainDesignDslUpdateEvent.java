package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 更新业务域DSL-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignDslUpdateEvent extends BaseDomainEvent {
    
    /** 业务域场景ID */
    private Long id;

    /** 业务域抽象文本描述语言 */
    private String domainDesignDsl;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;
    
    public DomainDesignDslUpdateEvent() {}

    public DomainDesignDslUpdateEvent(DomainDesignDslUpdateCmd cmd
    ) {
        this.id = cmd.getId();
        this.domainDesignDsl = cmd.getDomainDesignDsl();
        this.graphDsl = cmd.getGraphDsl();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

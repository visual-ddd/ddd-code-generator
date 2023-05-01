package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.domaindesign.domaindesign.*;

/**
 * 编辑业务域-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignModifyCmdEvent extends BaseDomainEvent {
    
    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;
    
    public DomainDesignModifyCmdEvent() {}

    public DomainDesignModifyCmdEvent(DomainDesignModifyCmd cmd
    ) {
        this.id = cmd.getId();
        this.name = cmd.getName();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify}";
    }
}

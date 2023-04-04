package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.*;

/**
 * 新增业务域版本-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainDesignVersionCreateEvent extends BaseDomainEvent {
    
    /** 业务域 ID */
    private Long id;

    /** 业务域的唯一标识 */
    private Long domainDesignId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;
    
    public DomainDesignVersionCreateEvent() {}

    public DomainDesignVersionCreateEvent(DomainDesignVersionCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.domainDesignId = cmd.getDomainDesignId();
        this.startVersion = cmd.getStartVersion();
        this.currentVersion = cmd.getCurrentVersion();
        this.description = cmd.getDescription();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

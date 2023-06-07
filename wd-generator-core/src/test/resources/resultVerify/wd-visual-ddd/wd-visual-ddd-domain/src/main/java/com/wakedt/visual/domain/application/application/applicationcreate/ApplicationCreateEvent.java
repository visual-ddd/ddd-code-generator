package com.wakedt.visual.domain.application.application.applicationcreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.application.application.*;

/**
 * 新增应用-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplicationCreateEvent extends BaseDomainEvent {
    
    /** 应用 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;
    
    public ApplicationCreateEvent() {}

    public ApplicationCreateEvent(ApplicationCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.teamId = cmd.getTeamId();
        this.name = cmd.getName();
        this.identity = cmd.getIdentity();
        this.packageName = cmd.getPackageName();
        this.description = cmd.getDescription();
        this.startVersion = cmd.getStartVersion();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.application.application.applicationcreate}";
    }
}

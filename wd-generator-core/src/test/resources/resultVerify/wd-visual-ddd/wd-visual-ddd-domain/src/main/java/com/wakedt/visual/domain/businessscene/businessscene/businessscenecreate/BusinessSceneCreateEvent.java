package com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.businessscene.businessscene.*;

/**
 * 新增业务场景-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneCreateEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;
    
    public BusinessSceneCreateEvent() {}

    public BusinessSceneCreateEvent(BusinessSceneCreateCmd cmd
        , Long id
    ) {
        this.id = id;
        this.teamId = cmd.getTeamId();
        this.name = cmd.getName();
        this.identity = cmd.getIdentity();
        this.description = cmd.getDescription();
        this.startVersion = cmd.getStartVersion();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

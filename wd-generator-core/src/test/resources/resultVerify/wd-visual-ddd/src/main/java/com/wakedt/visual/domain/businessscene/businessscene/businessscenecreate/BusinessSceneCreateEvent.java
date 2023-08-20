package com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增业务场景-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessSceneCreateEvent extends BaseDomainEvent {
    
    /** 业务场景 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

    /** 起始版本号 */
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
        return "${event.com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate}";
    }
}

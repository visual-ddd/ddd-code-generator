package com.wakedt.visual.domain.organization.teammember.teammemberrolebind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 绑定团队成员职位-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamMemberRoleBindEvent extends BaseDomainEvent {
    
    /** 团队成员ID */
    private Long id;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;
    
    public TeamMemberRoleBindEvent() {}

    public TeamMemberRoleBindEvent(TeamMemberRoleBindCmd cmd
    ) {
        this.id = cmd.getId();
        this.memberTypeList = cmd.getMemberTypeList();
    }

    @Override
    public String eventCode() {
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

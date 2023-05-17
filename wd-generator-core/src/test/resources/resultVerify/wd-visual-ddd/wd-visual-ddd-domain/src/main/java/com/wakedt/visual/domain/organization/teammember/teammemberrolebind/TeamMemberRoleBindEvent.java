package com.wakedt.visual.domain.organization.teammember.teammemberrolebind;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import com.wakedt.visual.domain.organization.teammember.MemberType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

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
        return "${event.com.wakedt.visual.domain.organization.teammember.teammemberrolebind}";
    }
}

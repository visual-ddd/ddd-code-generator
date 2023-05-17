package com.wakedt.visual.domain.organization.teammember.teammemberadd;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import com.wakedt.visual.domain.organization.teammember.MemberType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 添加团队成员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamMemberAddEvent extends BaseDomainEvent {
    
    /** 成员账号ID */
    private Long accountId;

    /** 团队ID */
    private Long teamId;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;
    
    public TeamMemberAddEvent() {}

    public TeamMemberAddEvent(TeamMemberAddCmd cmd
    ) {
        this.accountId = cmd.getAccountId();
        this.teamId = cmd.getTeamId();
        this.memberTypeList = cmd.getMemberTypeList();
    }

    @Override
    public String eventCode() {
        return "${event.com.wakedt.visual.domain.organization.teammember.teammemberadd}";
    }
}

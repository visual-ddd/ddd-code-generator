package com.wakedt.visual.domain.organization.teammember.teammemberadd;

import com.wakedata.common.domainevent.model.BaseDomainEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 添加团队成员-指令事件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamMemberAddEvent extends BaseDomainEvent {
    
    /** 团队成员的账号唯一标识 */
    private Long accountId;

    /** 团队唯一标识 */
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
        return "${event.${IMPORT_PACKAGE_MAP.get(${CMD_EVENT_CLASS_NAME})}";
    }
}

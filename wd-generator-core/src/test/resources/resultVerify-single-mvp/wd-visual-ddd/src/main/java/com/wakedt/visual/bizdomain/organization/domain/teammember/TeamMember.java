package com.wakedt.visual.bizdomain.organization.domain.teammember;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRemoveDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRoleBindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRoleUnBindDTO;

/**
 * 团队成员-聚合根
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
public class TeamMember {

    /** 团队成员ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 成员账号ID */
    private Long accountId;

    /** 成员类型标签 */
    private List<Integer> memberTypeList;

    public void teamMemberRemove(TeamMemberRemoveDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void teamMemberRoleBind(TeamMemberRoleBindDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

    public void teamManagerRoleUnbind(TeamMemberRoleUnBindDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setMemberTypeList(updateCmd.getMemberTypeList());
    }

}
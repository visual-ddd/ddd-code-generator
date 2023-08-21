package com.wakedt.visual.organization.domain.team;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.organization.app.cmd.teammodify.TeamModifyCmd;
import com.wakedt.visual.organization.app.cmd.teamremove.TeamRemoveCmd;
import com.wakedt.visual.organization.app.cmd.teammanagerbind.TeamManagerBindCmd;
import com.wakedt.visual.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmd;

/**
 * 团队-聚合根
 */
@Data
public class Team {

    /** 团队ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;

    public void teamModify(TeamModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
        this.setOrganizationId(updateCmd.getOrganizationId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void teamRemove(TeamRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void teamManagerBind(TeamManagerBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setTeamManagerId(updateCmd.getTeamManagerId());
    }

    public void teamManagerUnbind(TeamManagerUnBindCmd updateCmd) {
        this.setId(updateCmd.getId());
    }

}
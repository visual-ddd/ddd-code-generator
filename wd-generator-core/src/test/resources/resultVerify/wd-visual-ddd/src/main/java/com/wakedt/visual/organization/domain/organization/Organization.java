package com.wakedt.visual.organization.domain.organization;

import com.wakedt.visual.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmd;
import com.wakedt.visual.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmd;
import com.wakedt.visual.organization.app.cmd.organizationmodify.OrganizationModifyCmd;
import com.wakedt.visual.organization.app.cmd.organizationremove.OrganizationRemoveCmd;
import lombok.Data;

/**
 * 组织-聚合根
 */
@Data
public class Organization {

    /** 组织 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;

    public void organizationModify(OrganizationModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
        this.setOrganizationManagerId(updateCmd.getOrganizationManagerId());
    }

    public void organizationRemove(OrganizationRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void organizationManagerUnbind(OrganizationManagerUnbindCmd updateCmd) {
        this.setId(updateCmd.getId());
    }

    public void organizationManagerBind(OrganizationManagerBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setOrganizationManagerId(updateCmd.getOrganizationManagerId());
    }

}
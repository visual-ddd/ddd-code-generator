package com.wakedt.visual.domain.organization.organization;

import com.wakedt.visual.domain.organization.organization.organizationmanagerbind.OrganizationManagerBindCmd;
import com.wakedt.visual.domain.organization.organization.organizationmanagerunbind.OrganizationManagerUnbindCmd;
import com.wakedt.visual.domain.organization.organization.organizationmodify.OrganizationModifyCmd;
import com.wakedt.visual.domain.organization.organization.organizationremove.OrganizationRemoveCmd;

/**
 * 组织-聚合根能力
 */
public class Organization extends AbstractOrganization {

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
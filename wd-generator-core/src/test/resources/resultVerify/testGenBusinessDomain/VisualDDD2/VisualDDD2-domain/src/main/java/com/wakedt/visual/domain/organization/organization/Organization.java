package com.wakedt.visual.domain.organization.organization;

import java.util.List;
import com.wakedt.visual.domain.organization.organization.modify.OrganizationModifyCmd;
import com.wakedt.visual.domain.organization.organization.remove.OrganizationRemoveCmd;
import com.wakedt.visual.domain.organization.organization.managerbind.OrganizationManagerBindCmd;
import com.wakedt.visual.domain.organization.organization.managerunbind.OrganizationManagerUnbindCmd;

/**
 * 组织结构管理的领域-聚合根能力
 */
public class Organization extends AbstractOrganization {

    public void modify(OrganizationModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescritption(updateCmd.getDescritption());
        this.setOrganizationTeamManagerId(updateCmd.getOrganizationTeamManagerId());
    }

    public void remove(OrganizationRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void managerBind(OrganizationManagerBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setOrganizationTeamManagerId(updateCmd.getOrganizationTeamManagerId());
    }

    public void managerUnBind(OrganizationManagerUnbindCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}
package com.wakedt.visual.bizdomain.organization.domain.organization;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationModifyDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationRemoveDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerUnbindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerBindDTO;

/**
 * 组织-聚合根
 *
 * @author visual-ddd
 * @since 1.0
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

    public void organizationModify(OrganizationModifyDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
        this.setOrganizationManagerId(updateCmd.getOrganizationManagerId());
    }

    public void organizationRemove(OrganizationRemoveDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void organizationManagerUnbind(OrganizationManagerUnbindDTO updateCmd) {
        this.setId(updateCmd.getId());
    }

    public void organizationManagerBind(OrganizationManagerBindDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setOrganizationManagerId(updateCmd.getOrganizationManagerId());
    }

}
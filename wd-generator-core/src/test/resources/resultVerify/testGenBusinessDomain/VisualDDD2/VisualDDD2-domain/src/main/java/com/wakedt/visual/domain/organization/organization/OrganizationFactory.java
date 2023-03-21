package com.wakedt.visual.domain.organization.organization;

import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.organization.create.OrganizationCreateCmd;

/**
 * 组织结构管理的领域-聚合根-工厂
 */
@Component
public class OrganizationFactory {

    public Organization getInstance(OrganizationCreateCmd createCmd) {
        Organization instance = new Organization();
        instance.setName(createCmd.getName());
        instance.setDescritption(createCmd.getDescritption());
        instance.setOrganizationTeamManagerId(createCmd.getOrganizationTeamManagerId());
        return instance;
    }

}

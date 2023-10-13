package com.wakedt.visual.organization.domain.organization;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.app.cmd.organizationcreate.OrganizationCreateCmd;

/**
 * 组织-聚合根-工厂
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class OrganizationFactory {

    public Organization getInstance(OrganizationCreateCmd createCmd) {
        Organization instance = new Organization();
        instance.setName(createCmd.getName());
        instance.setDescription(createCmd.getDescription());
        instance.setOrganizationManagerId(createCmd.getOrganizationManagerId());
        return instance;
    }

}

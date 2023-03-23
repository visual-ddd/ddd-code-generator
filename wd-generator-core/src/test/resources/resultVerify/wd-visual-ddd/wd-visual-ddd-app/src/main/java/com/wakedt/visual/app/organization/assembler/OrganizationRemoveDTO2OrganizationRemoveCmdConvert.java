package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.OrganizationRemoveDTO;
import com.wakedt.visual.domain.organization.organization.organizationremove.OrganizationRemoveCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface OrganizationRemoveDTO2OrganizationRemoveCmdConvert extends BaseConvert<OrganizationRemoveDTO, OrganizationRemoveCmd> {

    OrganizationRemoveDTO2OrganizationRemoveCmdConvert INSTANCE = Mappers.getMapper(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.class);
}
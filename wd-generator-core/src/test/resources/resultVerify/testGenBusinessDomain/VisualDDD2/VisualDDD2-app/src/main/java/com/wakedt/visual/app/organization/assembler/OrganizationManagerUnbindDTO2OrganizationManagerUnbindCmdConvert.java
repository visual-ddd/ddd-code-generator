package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.OrganizationManagerUnbindDTO;
import com.wakedt.visual.domain.organization.organization.managerunbind.OrganizationManagerUnbindCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert extends BaseConvert<OrganizationManagerUnbindDTO, OrganizationManagerUnbindCmd> {

    OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.class);
}
package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.OrganizationManagerUnbindDTO;
import com.wakedt.visual.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert extends BaseConvert<OrganizationManagerUnbindDTO, OrganizationManagerUnbindCmd> {

    OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.class);
}
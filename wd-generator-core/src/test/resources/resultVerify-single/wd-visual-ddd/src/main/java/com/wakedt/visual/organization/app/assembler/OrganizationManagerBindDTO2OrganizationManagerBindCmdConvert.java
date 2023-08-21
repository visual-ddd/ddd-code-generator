package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.OrganizationManagerBindDTO;
import com.wakedt.visual.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert extends BaseConvert<OrganizationManagerBindDTO, OrganizationManagerBindCmd> {

    OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.class);
}
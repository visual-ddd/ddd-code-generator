package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.OrganizationRemoveDTO;
import com.wakedt.visual.organization.app.cmd.organizationremove.OrganizationRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationRemoveDTO2OrganizationRemoveCmdConvert extends BaseConvert<OrganizationRemoveDTO, OrganizationRemoveCmd> {

    OrganizationRemoveDTO2OrganizationRemoveCmdConvert INSTANCE = Mappers.getMapper(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.class);
}
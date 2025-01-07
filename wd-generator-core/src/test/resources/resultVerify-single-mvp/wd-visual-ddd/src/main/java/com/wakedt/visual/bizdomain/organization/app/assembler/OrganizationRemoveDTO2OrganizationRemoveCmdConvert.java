package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationRemoveDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationremove.OrganizationRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationRemoveDTO2OrganizationRemoveCmdConvert extends BaseConvert<OrganizationRemoveDTO, OrganizationRemoveCmd> {

    OrganizationRemoveDTO2OrganizationRemoveCmdConvert INSTANCE = Mappers.getMapper(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.class);
}
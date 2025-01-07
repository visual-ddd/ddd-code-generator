package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerUnbindDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert extends BaseConvert<OrganizationManagerUnbindDTO, OrganizationManagerUnbindCmd> {

    OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.class);
}
package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerBindDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert extends BaseConvert<OrganizationManagerBindDTO, OrganizationManagerBindCmd> {

    OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.class);
}
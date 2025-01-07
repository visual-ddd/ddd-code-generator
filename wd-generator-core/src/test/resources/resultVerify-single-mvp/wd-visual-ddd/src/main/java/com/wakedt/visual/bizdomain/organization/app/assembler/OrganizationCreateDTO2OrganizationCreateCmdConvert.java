package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationCreateDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationcreate.OrganizationCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationCreateDTO2OrganizationCreateCmdConvert extends BaseConvert<OrganizationCreateDTO, OrganizationCreateCmd> {

    OrganizationCreateDTO2OrganizationCreateCmdConvert INSTANCE = Mappers.getMapper(OrganizationCreateDTO2OrganizationCreateCmdConvert.class);
}
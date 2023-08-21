package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.app.cmd.organizationcreate.OrganizationCreateCmd;
import com.wakedt.visual.organization.client.query.OrganizationCreateDTO;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationCreateDTO2OrganizationCreateCmdConvert extends BaseConvert<OrganizationCreateDTO, OrganizationCreateCmd> {

    OrganizationCreateDTO2OrganizationCreateCmdConvert INSTANCE = Mappers.getMapper(OrganizationCreateDTO2OrganizationCreateCmdConvert.class);
}
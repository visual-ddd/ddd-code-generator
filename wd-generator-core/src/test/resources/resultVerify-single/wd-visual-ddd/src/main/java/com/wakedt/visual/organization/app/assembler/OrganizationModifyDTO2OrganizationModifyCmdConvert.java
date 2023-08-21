package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.OrganizationModifyDTO;
import com.wakedt.visual.organization.app.cmd.organizationmodify.OrganizationModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationModifyDTO2OrganizationModifyCmdConvert extends BaseConvert<OrganizationModifyDTO, OrganizationModifyCmd> {

    OrganizationModifyDTO2OrganizationModifyCmdConvert INSTANCE = Mappers.getMapper(OrganizationModifyDTO2OrganizationModifyCmdConvert.class);
}
package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.OrganizationModifyDTO;
import com.wakedt.visual.domain.organization.organization.modify.OrganizationModifyCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface OrganizationModifyDTO2OrganizationModifyCmdConvert extends BaseConvert<OrganizationModifyDTO, OrganizationModifyCmd> {

    OrganizationModifyDTO2OrganizationModifyCmdConvert INSTANCE = Mappers.getMapper(OrganizationModifyDTO2OrganizationModifyCmdConvert.class);
}
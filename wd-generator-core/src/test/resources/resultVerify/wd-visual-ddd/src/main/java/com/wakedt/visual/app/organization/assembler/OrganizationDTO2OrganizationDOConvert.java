package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationDTO2OrganizationDOConvert extends BaseConvert<OrganizationDTO, OrganizationDO> {

    OrganizationDTO2OrganizationDOConvert INSTANCE = Mappers.getMapper(OrganizationDTO2OrganizationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationManagerId", target = "organizationManagerId")
    @Override
    OrganizationDO dto2Do(OrganizationDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationManagerId", target = "organizationManagerId")
    @Override
    OrganizationDTO do2Dto(OrganizationDO d);
}
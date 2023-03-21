package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.organization.organization.Organization;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;

@Mapper(uses = {
})
public interface Organization2OrganizationDOConvert extends BaseConvert<Organization, OrganizationDO> {

    Organization2OrganizationDOConvert INSTANCE = Mappers.getMapper(Organization2OrganizationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "descritption", target = "descritption")
    @Mapping(source = "organizationTeamManagerId", target = "organizationTeamManagerId")
    @Override
    OrganizationDO dto2Do(Organization dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "descritption", target = "descritption")
    @Mapping(source = "organizationTeamManagerId", target = "organizationTeamManagerId")
    @Override
    Organization do2Dto(OrganizationDO d);
}

package com.wakedt.visual.organization.infrastructure.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.domain.organization.Organization;
import com.wakedt.visual.organization.infrastructure.repository.model.OrganizationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Organization2OrganizationDOConvert extends BaseConvert<Organization, OrganizationDO> {

    Organization2OrganizationDOConvert INSTANCE = Mappers.getMapper(Organization2OrganizationDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationManagerId", target = "organizationManagerId")
    @Override
    OrganizationDO dto2Do(Organization dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationManagerId", target = "organizationManagerId")
    @Override
    Organization do2Dto(OrganizationDO d);
}

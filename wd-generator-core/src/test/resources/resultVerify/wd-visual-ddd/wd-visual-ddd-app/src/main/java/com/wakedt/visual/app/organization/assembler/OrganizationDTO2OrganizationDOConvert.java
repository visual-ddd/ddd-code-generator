package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;

/**
 * OrganizationDTO2OrganizationDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        OrganizationDTOConverter.class,
        TeamDTOConverter.class,
        TeamMemberDTOConverter.class,
})
public interface OrganizationDTO2OrganizationDOConvert extends BaseConvert<OrganizationDTO, OrganizationDO> {

    OrganizationDTO2OrganizationDOConvert INSTANCE = Mappers.getMapper(OrganizationDTO2OrganizationDOConvert.class);

}
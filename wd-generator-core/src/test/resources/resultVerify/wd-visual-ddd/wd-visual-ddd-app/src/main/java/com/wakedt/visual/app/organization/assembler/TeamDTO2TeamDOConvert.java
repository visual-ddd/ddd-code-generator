package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamDTO2TeamDOConvert
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
public interface TeamDTO2TeamDOConvert extends BaseConvert<TeamDTO, TeamDO> {

    TeamDTO2TeamDOConvert INSTANCE = Mappers.getMapper(TeamDTO2TeamDOConvert.class);

}
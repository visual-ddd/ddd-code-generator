package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.dto.TeamMemberDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamMemberDTO2TeamMemberDOConvert
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
public interface TeamMemberDTO2TeamMemberDOConvert extends BaseConvert<TeamMemberDTO, TeamMemberDO> {

    TeamMemberDTO2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMemberDTO2TeamMemberDOConvert.class);

}
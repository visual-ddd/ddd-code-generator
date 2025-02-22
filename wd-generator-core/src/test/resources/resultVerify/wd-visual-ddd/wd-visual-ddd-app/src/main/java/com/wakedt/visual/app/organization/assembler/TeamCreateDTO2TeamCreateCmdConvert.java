package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamCreateDTO;
import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmd;

/**
 * TeamCreateDTO2TeamCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamCreateDTO2TeamCreateCmdConvert extends BaseConvert<TeamCreateDTO, TeamCreateCmd> {

    TeamCreateDTO2TeamCreateCmdConvert INSTANCE = Mappers.getMapper(TeamCreateDTO2TeamCreateCmdConvert.class);
}
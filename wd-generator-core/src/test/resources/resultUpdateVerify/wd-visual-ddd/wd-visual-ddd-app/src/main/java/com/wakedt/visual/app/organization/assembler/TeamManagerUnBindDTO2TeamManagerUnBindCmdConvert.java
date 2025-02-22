package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamManagerUnBindDTO;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert extends BaseConvert<TeamManagerUnBindDTO, TeamManagerUnBindCmd> {

    TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.class);
}
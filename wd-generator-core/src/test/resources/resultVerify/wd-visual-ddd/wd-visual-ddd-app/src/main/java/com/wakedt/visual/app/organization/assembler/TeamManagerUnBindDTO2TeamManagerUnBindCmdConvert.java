package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamManagerUnBindDTO;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmd;

/**
 * TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert extends BaseConvert<TeamManagerUnBindDTO, TeamManagerUnBindCmd> {

    TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.class);
}
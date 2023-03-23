package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamManagerUnBindDTO;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert extends BaseConvert<TeamManagerUnBindDTO, TeamManagerUnBindCmd> {

    TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.class);
}
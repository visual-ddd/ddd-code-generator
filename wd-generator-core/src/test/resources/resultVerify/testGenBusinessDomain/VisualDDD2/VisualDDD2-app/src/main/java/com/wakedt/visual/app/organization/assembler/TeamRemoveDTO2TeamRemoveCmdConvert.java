package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamRemoveDTO;
import com.wakedt.visual.domain.organization.team.remove.TeamRemoveCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface TeamRemoveDTO2TeamRemoveCmdConvert extends BaseConvert<TeamRemoveDTO, TeamRemoveCmd> {

    TeamRemoveDTO2TeamRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamRemoveDTO2TeamRemoveCmdConvert.class);
}
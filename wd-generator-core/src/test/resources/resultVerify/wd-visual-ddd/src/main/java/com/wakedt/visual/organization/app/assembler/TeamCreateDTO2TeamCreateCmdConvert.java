package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.app.cmd.teamcreate.TeamCreateCmd;
import com.wakedt.visual.organization.client.query.TeamCreateDTO;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamCreateDTO2TeamCreateCmdConvert extends BaseConvert<TeamCreateDTO, TeamCreateCmd> {

    TeamCreateDTO2TeamCreateCmdConvert INSTANCE = Mappers.getMapper(TeamCreateDTO2TeamCreateCmdConvert.class);
}
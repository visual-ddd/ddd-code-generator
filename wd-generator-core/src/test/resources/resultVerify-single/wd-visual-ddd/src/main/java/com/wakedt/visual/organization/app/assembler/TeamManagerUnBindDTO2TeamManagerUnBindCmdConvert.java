package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.TeamManagerUnBindDTO;
import com.wakedt.visual.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert extends BaseConvert<TeamManagerUnBindDTO, TeamManagerUnBindCmd> {

    TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.class);
}
package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.TeamManagerBindDTO;
import com.wakedt.visual.organization.app.cmd.teammanagerbind.TeamManagerBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerBindDTO2TeamManagerBindCmdConvert extends BaseConvert<TeamManagerBindDTO, TeamManagerBindCmd> {

    TeamManagerBindDTO2TeamManagerBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerBindDTO2TeamManagerBindCmdConvert.class);
}
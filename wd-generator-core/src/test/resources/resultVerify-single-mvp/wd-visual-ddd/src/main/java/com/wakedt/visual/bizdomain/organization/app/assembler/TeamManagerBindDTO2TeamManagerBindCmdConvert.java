package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamManagerBindDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerbind.TeamManagerBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerBindDTO2TeamManagerBindCmdConvert extends BaseConvert<TeamManagerBindDTO, TeamManagerBindCmd> {

    TeamManagerBindDTO2TeamManagerBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerBindDTO2TeamManagerBindCmdConvert.class);
}
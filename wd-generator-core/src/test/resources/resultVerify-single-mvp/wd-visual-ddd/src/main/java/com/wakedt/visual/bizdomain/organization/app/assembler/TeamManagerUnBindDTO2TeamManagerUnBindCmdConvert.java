package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamManagerUnBindDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert extends BaseConvert<TeamManagerUnBindDTO, TeamManagerUnBindCmd> {

    TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.class);
}
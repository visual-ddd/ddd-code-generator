package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamCreateDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teamcreate.TeamCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamCreateDTO2TeamCreateCmdConvert extends BaseConvert<TeamCreateDTO, TeamCreateCmd> {

    TeamCreateDTO2TeamCreateCmdConvert INSTANCE = Mappers.getMapper(TeamCreateDTO2TeamCreateCmdConvert.class);
}
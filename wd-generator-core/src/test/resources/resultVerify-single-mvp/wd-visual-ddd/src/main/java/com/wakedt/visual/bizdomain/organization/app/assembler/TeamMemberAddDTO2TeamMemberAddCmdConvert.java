package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberAddDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberadd.TeamMemberAddCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMemberAddDTO2TeamMemberAddCmdConvert extends BaseConvert<TeamMemberAddDTO, TeamMemberAddCmd> {

    TeamMemberAddDTO2TeamMemberAddCmdConvert INSTANCE = Mappers.getMapper(TeamMemberAddDTO2TeamMemberAddCmdConvert.class);
}
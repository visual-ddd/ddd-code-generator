package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRemoveDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberremove.TeamMemberRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert extends BaseConvert<TeamMemberRemoveDTO, TeamMemberRemoveCmd> {

    TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.class);
}
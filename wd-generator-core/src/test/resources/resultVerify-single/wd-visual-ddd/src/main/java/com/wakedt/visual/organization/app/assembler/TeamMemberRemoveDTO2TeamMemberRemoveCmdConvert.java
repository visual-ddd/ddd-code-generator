package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.TeamMemberRemoveDTO;
import com.wakedt.visual.organization.app.cmd.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.organization.domain.teammember.MemberTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert extends BaseConvert<TeamMemberRemoveDTO, TeamMemberRemoveCmd> {

    TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.class);
}
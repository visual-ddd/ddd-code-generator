package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamMemberRemoveDTO;
import com.wakedt.visual.domain.organization.teammember.memberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;

@Mapper(uses = {
        MemberTypeConverter.class,
        JsonConverter.class,
})
public interface TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert extends BaseConvert<TeamMemberRemoveDTO, TeamMemberRemoveCmd> {

    TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.class);
}
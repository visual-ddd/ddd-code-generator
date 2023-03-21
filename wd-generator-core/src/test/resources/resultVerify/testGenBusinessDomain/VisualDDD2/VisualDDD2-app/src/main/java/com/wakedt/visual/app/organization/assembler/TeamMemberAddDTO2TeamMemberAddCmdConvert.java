package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamMemberAddDTO;
import com.wakedt.visual.domain.organization.teammember.memberadd.TeamMemberAddCmd;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;

@Mapper(uses = {
        MemberTypeConverter.class,
        JsonConverter.class,
})
public interface TeamMemberAddDTO2TeamMemberAddCmdConvert extends BaseConvert<TeamMemberAddDTO, TeamMemberAddCmd> {

    TeamMemberAddDTO2TeamMemberAddCmdConvert INSTANCE = Mappers.getMapper(TeamMemberAddDTO2TeamMemberAddCmdConvert.class);
}
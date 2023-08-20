package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamMemberRemoveDTO;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;
import com.wakedt.visual.domain.organization.teammember.teammemberremove.TeamMemberRemoveCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert extends BaseConvert<TeamMemberRemoveDTO, TeamMemberRemoveCmd> {

    TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.class);
}
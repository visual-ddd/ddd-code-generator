package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamMemberRoleBindDTO;
import com.wakedt.visual.domain.organization.teammember.teammemberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;

@Mapper(uses = {
        MemberTypeConverter.class,
        JsonConverter.class,
})
public interface TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert extends BaseConvert<TeamMemberRoleBindDTO, TeamMemberRoleBindCmd> {

    TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.class);
}
package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmd;
import com.wakedt.visual.organization.client.query.TeamMemberRoleBindDTO;
import com.wakedt.visual.organization.domain.teammember.MemberTypeConverter;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert extends BaseConvert<TeamMemberRoleBindDTO, TeamMemberRoleBindCmd> {

    TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.class);
}
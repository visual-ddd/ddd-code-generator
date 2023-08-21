package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamMemberRoleUnBindDTO;
import com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind.TeamMemberRoleUnBindCmd;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert extends BaseConvert<TeamMemberRoleUnBindDTO, TeamMemberRoleUnBindCmd> {

    TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert.class);
}
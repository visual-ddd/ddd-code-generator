package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.TeamMemberRoleUnBindDTO;
import com.wakedt.visual.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmd;
import com.wakedt.visual.organization.domain.teammember.MemberTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert extends BaseConvert<TeamMemberRoleUnBindDTO, TeamMemberRoleUnBindCmd> {

    TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert.class);
}
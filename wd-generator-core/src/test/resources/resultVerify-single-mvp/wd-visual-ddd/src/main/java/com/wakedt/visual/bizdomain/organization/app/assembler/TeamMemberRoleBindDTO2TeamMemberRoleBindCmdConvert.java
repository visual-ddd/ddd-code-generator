package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRoleBindDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert extends BaseConvert<TeamMemberRoleBindDTO, TeamMemberRoleBindCmd> {

    TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert INSTANCE = Mappers.getMapper(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.class);
}
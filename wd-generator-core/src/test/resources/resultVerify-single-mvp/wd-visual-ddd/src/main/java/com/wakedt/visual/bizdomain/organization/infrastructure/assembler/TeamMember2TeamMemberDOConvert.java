package com.wakedt.visual.bizdomain.organization.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.domain.teammember.TeamMember;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamMemberDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMember2TeamMemberDOConvert extends BaseConvert<TeamMember, TeamMemberDO> {

    TeamMember2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMember2TeamMemberDOConvert.class);

}

package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.organization.teammember.TeamMember;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;

@Mapper(uses = {
        MemberTypeConverter.class,
})
public interface TeamMember2TeamMemberDOConvert extends BaseConvert<TeamMember, TeamMemberDO> {

    TeamMember2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMember2TeamMemberDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountId", target = "accountId")
    @Mapping(source = "teamId", target = "accountId")
    @Override
    TeamMemberDO dto2Do(TeamMember dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "accountId", target = "accountId")
    @Mapping(source = "accountId", target = "teamId")
    @Override
    TeamMember do2Dto(TeamMemberDO d);
}

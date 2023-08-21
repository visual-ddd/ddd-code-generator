package com.wakedt.visual.organization.infrastructure.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.domain.teammember.TeamMember;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import com.wakedt.visual.organization.domain.teammember.MemberTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMember2TeamMemberDOConvert extends BaseConvert<TeamMember, TeamMemberDO> {

    TeamMember2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMember2TeamMemberDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "accountId", target = "accountId")
    @Override
    TeamMemberDO dto2Do(TeamMember dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "accountId", target = "accountId")
    @Override
    TeamMember do2Dto(TeamMemberDO d);
}

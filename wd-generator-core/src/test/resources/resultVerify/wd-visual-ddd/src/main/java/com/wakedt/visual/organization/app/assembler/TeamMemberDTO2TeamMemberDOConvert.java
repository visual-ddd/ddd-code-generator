package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.client.dto.TeamMemberDTO;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMemberDTO2TeamMemberDOConvert extends BaseConvert<TeamMemberDTO, TeamMemberDO> {

    TeamMemberDTO2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMemberDTO2TeamMemberDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "accountId", target = "accountId")
    @Override
    TeamMemberDO dto2Do(TeamMemberDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "accountId", target = "accountId")
    @Override
    TeamMemberDTO do2Dto(TeamMemberDO d);
}
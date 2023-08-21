package com.wakedt.visual.organization.infrastructure.assembler;

import com.wakedt.visual.organization.domain.team.Team;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Team2TeamDOConvert extends BaseConvert<Team, TeamDO> {

    Team2TeamDOConvert INSTANCE = Mappers.getMapper(Team2TeamDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationId", target = "organizationId")
    @Mapping(source = "teamManagerId", target = "teamManagerId")
    @Override
    TeamDO dto2Do(Team dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationId", target = "organizationId")
    @Mapping(source = "teamManagerId", target = "teamManagerId")
    @Override
    Team do2Dto(TeamDO d);
}

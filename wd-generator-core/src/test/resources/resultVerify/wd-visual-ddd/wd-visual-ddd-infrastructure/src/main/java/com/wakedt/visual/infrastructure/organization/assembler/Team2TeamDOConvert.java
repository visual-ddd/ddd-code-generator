package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;

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

package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamDTO2TeamDOConvert extends BaseConvert<TeamDTO, TeamDO> {

    TeamDTO2TeamDOConvert INSTANCE = Mappers.getMapper(TeamDTO2TeamDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationId", target = "organizationId")
    @Mapping(source = "teamManagerId", target = "teamManagerId")
    @Override
    TeamDO dto2Do(TeamDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "organizationId", target = "organizationId")
    @Mapping(source = "teamManagerId", target = "teamManagerId")
    @Override
    TeamDTO do2Dto(TeamDO d);
}
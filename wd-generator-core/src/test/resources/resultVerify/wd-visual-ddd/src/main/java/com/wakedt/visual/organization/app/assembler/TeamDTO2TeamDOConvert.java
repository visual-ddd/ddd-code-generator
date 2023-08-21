package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.client.dto.TeamDTO;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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
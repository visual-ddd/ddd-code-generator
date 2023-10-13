package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;

/**
 * Team2TeamDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Team2TeamDOConvert extends BaseConvert<Team, TeamDO> {

    Team2TeamDOConvert INSTANCE = Mappers.getMapper(Team2TeamDOConvert.class);

}

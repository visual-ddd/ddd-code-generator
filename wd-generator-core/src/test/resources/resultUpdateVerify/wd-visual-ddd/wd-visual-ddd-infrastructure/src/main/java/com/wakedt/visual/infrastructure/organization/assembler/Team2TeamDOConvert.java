package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Team2TeamDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Team2TeamDOConvert extends BaseConvert<Team, TeamDO> {

    Team2TeamDOConvert INSTANCE = Mappers.getMapper(Team2TeamDOConvert.class);

}

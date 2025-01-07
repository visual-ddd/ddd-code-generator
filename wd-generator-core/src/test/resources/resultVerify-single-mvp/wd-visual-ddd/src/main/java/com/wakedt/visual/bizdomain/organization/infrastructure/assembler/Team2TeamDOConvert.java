package com.wakedt.visual.bizdomain.organization.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.domain.team.Team;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Team2TeamDOConvert extends BaseConvert<Team, TeamDO> {

    Team2TeamDOConvert INSTANCE = Mappers.getMapper(Team2TeamDOConvert.class);

}

package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.organization.client.response.TeamDTO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamDTO2TeamDOConvert extends BaseConvert<TeamDTO, TeamDO> {

    TeamDTO2TeamDOConvert INSTANCE = Mappers.getMapper(TeamDTO2TeamDOConvert.class);

}
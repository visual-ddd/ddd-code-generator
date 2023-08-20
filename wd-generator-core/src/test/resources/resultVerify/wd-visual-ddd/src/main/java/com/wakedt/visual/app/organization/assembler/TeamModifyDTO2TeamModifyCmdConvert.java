package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamModifyDTO;
import com.wakedt.visual.domain.organization.team.teammodify.TeamModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamModifyDTO2TeamModifyCmdConvert extends BaseConvert<TeamModifyDTO, TeamModifyCmd> {

    TeamModifyDTO2TeamModifyCmdConvert INSTANCE = Mappers.getMapper(TeamModifyDTO2TeamModifyCmdConvert.class);
}
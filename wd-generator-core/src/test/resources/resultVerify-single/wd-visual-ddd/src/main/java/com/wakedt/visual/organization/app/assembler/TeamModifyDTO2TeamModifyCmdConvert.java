package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.organization.client.query.TeamModifyDTO;
import com.wakedt.visual.organization.app.cmd.teammodify.TeamModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamModifyDTO2TeamModifyCmdConvert extends BaseConvert<TeamModifyDTO, TeamModifyCmd> {

    TeamModifyDTO2TeamModifyCmdConvert INSTANCE = Mappers.getMapper(TeamModifyDTO2TeamModifyCmdConvert.class);
}
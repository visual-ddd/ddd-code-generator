package com.wakedt.visual.organization.app.assembler;

import com.wakedt.visual.organization.app.cmd.teamremove.TeamRemoveCmd;
import com.wakedt.visual.organization.client.query.TeamRemoveDTO;
import com.wakedt.visual.organization.infrastructure.BaseConvert;
import com.wakedt.visual.organization.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamRemoveDTO2TeamRemoveCmdConvert extends BaseConvert<TeamRemoveDTO, TeamRemoveCmd> {

    TeamRemoveDTO2TeamRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamRemoveDTO2TeamRemoveCmdConvert.class);
}
package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamRemoveDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teamremove.TeamRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamRemoveDTO2TeamRemoveCmdConvert extends BaseConvert<TeamRemoveDTO, TeamRemoveCmd> {

    TeamRemoveDTO2TeamRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamRemoveDTO2TeamRemoveCmdConvert.class);
}
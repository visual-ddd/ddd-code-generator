package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.TeamModifyDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammodify.TeamModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamModifyDTO2TeamModifyCmdConvert extends BaseConvert<TeamModifyDTO, TeamModifyCmd> {

    TeamModifyDTO2TeamModifyCmdConvert INSTANCE = Mappers.getMapper(TeamModifyDTO2TeamModifyCmdConvert.class);
}
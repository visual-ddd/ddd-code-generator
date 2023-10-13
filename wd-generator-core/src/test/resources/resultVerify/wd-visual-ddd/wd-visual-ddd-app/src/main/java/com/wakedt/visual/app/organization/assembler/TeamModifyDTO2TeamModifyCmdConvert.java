package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamModifyDTO;
import com.wakedt.visual.domain.organization.team.teammodify.TeamModifyCmd;

/**
 * TeamModifyDTO2TeamModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamModifyDTO2TeamModifyCmdConvert extends BaseConvert<TeamModifyDTO, TeamModifyCmd> {

    TeamModifyDTO2TeamModifyCmdConvert INSTANCE = Mappers.getMapper(TeamModifyDTO2TeamModifyCmdConvert.class);
}
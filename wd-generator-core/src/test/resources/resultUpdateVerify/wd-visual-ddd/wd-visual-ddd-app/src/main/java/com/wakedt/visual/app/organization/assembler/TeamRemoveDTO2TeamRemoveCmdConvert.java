package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamRemoveDTO;
import com.wakedt.visual.domain.organization.team.teamremove.TeamRemoveCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamRemoveDTO2TeamRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamRemoveDTO2TeamRemoveCmdConvert extends BaseConvert<TeamRemoveDTO, TeamRemoveCmd> {

    TeamRemoveDTO2TeamRemoveCmdConvert INSTANCE = Mappers.getMapper(TeamRemoveDTO2TeamRemoveCmdConvert.class);
}
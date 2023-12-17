package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamManagerBindDTO;
import com.wakedt.visual.domain.organization.team.teammanagerbind.TeamManagerBindCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamManagerBindDTO2TeamManagerBindCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerBindDTO2TeamManagerBindCmdConvert extends BaseConvert<TeamManagerBindDTO, TeamManagerBindCmd> {

    TeamManagerBindDTO2TeamManagerBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerBindDTO2TeamManagerBindCmdConvert.class);
}
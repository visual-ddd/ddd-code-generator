package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.TeamManagerBindDTO;
import com.wakedt.visual.domain.organization.team.teammanagerbind.TeamManagerBindCmd;

/**
 * TeamManagerBindDTO2TeamManagerBindCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamManagerBindDTO2TeamManagerBindCmdConvert extends BaseConvert<TeamManagerBindDTO, TeamManagerBindCmd> {

    TeamManagerBindDTO2TeamManagerBindCmdConvert INSTANCE = Mappers.getMapper(TeamManagerBindDTO2TeamManagerBindCmdConvert.class);
}
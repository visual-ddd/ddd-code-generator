package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.TeamMemberAddDTO;
import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;
import com.wakedt.visual.domain.organization.teammember.teammemberadd.TeamMemberAddCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamMemberAddDTO2TeamMemberAddCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMemberAddDTO2TeamMemberAddCmdConvert extends BaseConvert<TeamMemberAddDTO, TeamMemberAddCmd> {

    TeamMemberAddDTO2TeamMemberAddCmdConvert INSTANCE = Mappers.getMapper(TeamMemberAddDTO2TeamMemberAddCmdConvert.class);
}
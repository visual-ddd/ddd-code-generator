package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.domain.organization.teammember.MemberTypeConverter;
import com.wakedt.visual.domain.organization.teammember.TeamMember;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamMember2TeamMemberDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        MemberTypeConverter.class,
})
public interface TeamMember2TeamMemberDOConvert extends BaseConvert<TeamMember, TeamMemberDO> {

    TeamMember2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMember2TeamMemberDOConvert.class);

}

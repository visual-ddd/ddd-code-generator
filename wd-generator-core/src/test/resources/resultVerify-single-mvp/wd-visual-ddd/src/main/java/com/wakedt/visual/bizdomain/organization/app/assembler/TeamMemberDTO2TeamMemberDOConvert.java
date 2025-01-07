package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.organization.client.response.TeamMemberDTO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamMemberDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface TeamMemberDTO2TeamMemberDOConvert extends BaseConvert<TeamMemberDTO, TeamMemberDO> {

    TeamMemberDTO2TeamMemberDOConvert INSTANCE = Mappers.getMapper(TeamMemberDTO2TeamMemberDOConvert.class);

}
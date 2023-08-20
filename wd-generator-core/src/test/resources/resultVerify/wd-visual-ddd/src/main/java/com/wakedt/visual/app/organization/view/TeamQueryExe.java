package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.organization.assembler.TeamDTO2TeamDOConvert;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 团队详情查询对象-查询器
 */
@Component
public class TeamQueryExe {

    @Resource
    private TeamMapper mapper;

    public ResultDTO<TeamDTO> execute(TeamQuery query) {
        return ResultDTO.success(
                TeamDTO2TeamDOConvert.INSTANCE.do2Dto(mapper.teamQuery(query)));
    }
}

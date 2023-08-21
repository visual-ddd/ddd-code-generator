package com.wakedt.visual.organization.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.organization.app.assembler.TeamDTO2TeamDOConvert;
import com.wakedt.visual.organization.client.dto.TeamDTO;
import com.wakedt.visual.organization.client.query.TeamQuery;
import com.wakedt.visual.organization.infrastructure.repository.mapper.TeamMapper;
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

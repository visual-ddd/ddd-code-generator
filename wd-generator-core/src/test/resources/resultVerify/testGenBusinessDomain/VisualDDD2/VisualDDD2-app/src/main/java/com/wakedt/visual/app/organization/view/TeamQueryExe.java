package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.app.organization.assembler.TeamDTO2TeamDOConvert;

/**
 * 查询团队详情-查询器
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

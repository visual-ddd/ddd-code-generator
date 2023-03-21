package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.TeamInfoByAccountIdQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.app.organization.assembler.TeamDTO2TeamDOConvert;

/**
 * 根据账号查询所属团队信息列表-查询器
 */
@Component
public class TeamInfoByAccountIdQueryExe {

    @Resource
    private TeamMapper mapper;

    public ResultDTO<TeamDTO> execute(TeamInfoByAccountIdQuery query) {
        return ResultDTO.success(
                TeamDTO2TeamDOConvert.INSTANCE.do2Dto(mapper.teamInfoByAccountIdQuery(query)));
    }
}

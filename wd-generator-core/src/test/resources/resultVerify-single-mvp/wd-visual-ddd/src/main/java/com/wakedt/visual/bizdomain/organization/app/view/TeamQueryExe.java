package com.wakedt.visual.bizdomain.organization.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.organization.client.request.TeamQuery;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.TeamMapper;
import com.wakedt.visual.bizdomain.organization.client.response.TeamDTO;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamDTO2TeamDOConvert;

/**
 * 团队详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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

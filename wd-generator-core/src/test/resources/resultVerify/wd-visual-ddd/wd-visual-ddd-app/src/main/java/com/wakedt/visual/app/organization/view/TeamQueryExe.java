package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.app.organization.assembler.TeamDTO2TeamDOConvert;

/**
 * 团队详情查询对象-查询器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamQueryExe {

    @Resource
    private TeamMapper mapper;

    public ResultDTO<TeamDTO> execute(TeamQuery query) {
        log.info("团队详情查询对象-查询器:{}", query);
        return ResultDTO.success(TeamDTO2TeamDOConvert.INSTANCE.do2Dto(
                mapper.teamQuery(query)
        ));
    }
}

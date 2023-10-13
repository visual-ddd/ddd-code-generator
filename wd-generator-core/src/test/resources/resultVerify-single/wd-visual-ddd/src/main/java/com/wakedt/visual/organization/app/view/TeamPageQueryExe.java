package com.wakedt.visual.organization.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.client.query.TeamPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.organization.infrastructure.repository.mapper.TeamMapper;
import com.wakedt.visual.organization.client.dto.TeamDTO;
import com.wakedt.visual.organization.app.assembler.TeamDTO2TeamDOConvert;

/**
 * 团队分页查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Component
public class TeamPageQueryExe {

    @Resource
    private TeamMapper mapper;

    public PageResultDTO<List<TeamDTO>> execute(TeamPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<TeamDO> pageInfo = new PageInfo<>(mapper.teamPageQuery(pageQuery));
        PageResultDTO<List<TeamDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(TeamDTO2TeamDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}

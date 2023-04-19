package com.wakedt.visual.app.organization.view;

import java.util.*;
import java.math.*;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.TeamPageQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.app.organization.assembler.TeamDTO2TeamDOConvert;

/**
 * 分页查询团队-查询器
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

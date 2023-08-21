package com.wakedt.visual.organization.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.organization.app.assembler.TeamDTO2TeamDOConvert;
import com.wakedt.visual.organization.client.dto.TeamDTO;
import com.wakedt.visual.organization.client.query.TeamPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.mapper.TeamMapper;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 团队分页查询对象-查询器
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

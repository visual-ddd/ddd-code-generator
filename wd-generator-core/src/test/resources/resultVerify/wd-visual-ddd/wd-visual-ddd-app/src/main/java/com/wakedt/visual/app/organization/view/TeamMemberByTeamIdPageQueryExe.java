package com.wakedt.visual.app.organization.view;

import java.util.*;
import java.math.*;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMemberMapper;
import com.wakedt.visual.client.organization.dto.TeamMemberDTO;
import com.wakedt.visual.app.organization.assembler.TeamMemberDTO2TeamMemberDOConvert;

/**
 * 分页查询团队成员-查询器
 */
@Component
public class TeamMemberByTeamIdPageQueryExe {

    @Resource
    private TeamMemberMapper mapper;

    public PageResultDTO<List<TeamMemberDTO>> execute(TeamMemberByTeamIdPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());

        PageInfo<TeamMemberDO> pageInfo = new PageInfo<>(mapper.teamMemberByTeamIdPageQuery(pageQuery));
        PageResultDTO<List<TeamMemberDTO>> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setData(TeamMemberDTO2TeamMemberDOConvert.INSTANCE.doList2DtoList(pageInfo.getList()));
        pageResultDTO.setPageNo(pageInfo.getPageNum());
        pageResultDTO.setPageSize(pageInfo.getSize());
        pageResultDTO.setTotalCount(pageInfo.getTotal());
        return pageResultDTO;
    }
}

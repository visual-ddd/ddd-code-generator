package com.wakedt.visual.organization.app.view;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedt.visual.organization.app.assembler.TeamMemberDTO2TeamMemberDOConvert;
import com.wakedt.visual.organization.client.dto.TeamMemberDTO;
import com.wakedt.visual.organization.client.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.mapper.TeamMemberMapper;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 查询团队下的成员信息-查询器
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

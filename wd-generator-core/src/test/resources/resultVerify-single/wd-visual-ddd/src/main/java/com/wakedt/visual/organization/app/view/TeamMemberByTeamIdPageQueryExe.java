package com.wakedt.visual.organization.app.view;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.wakedata.common.core.dto.PageResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.client.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import com.wakedt.visual.organization.infrastructure.repository.mapper.TeamMemberMapper;
import com.wakedt.visual.organization.client.dto.TeamMemberDTO;
import com.wakedt.visual.organization.app.assembler.TeamMemberDTO2TeamMemberDOConvert;

/**
 * 查询团队下的成员信息-查询器
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
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

package com.wakedt.visual.organization.infrastructure.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.organization.client.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TeamMemberMapper接口
 */
@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMemberDO> {

    /** 查询团队下的成员信息 */
    List<TeamMemberDO> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}
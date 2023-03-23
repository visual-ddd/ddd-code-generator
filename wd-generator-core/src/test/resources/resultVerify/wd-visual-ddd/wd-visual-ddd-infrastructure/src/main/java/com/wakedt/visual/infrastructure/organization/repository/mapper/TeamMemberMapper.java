package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;

/**
 * TeamMemberMapper接口
 */
@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMemberDO> {

    /** 分页查询团队成员 */
    List<TeamMemberDO> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}
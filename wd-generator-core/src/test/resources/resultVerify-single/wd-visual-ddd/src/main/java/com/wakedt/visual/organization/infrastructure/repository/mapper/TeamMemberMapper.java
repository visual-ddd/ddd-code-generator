package com.wakedt.visual.organization.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamMemberDO;
import com.wakedt.visual.organization.client.query.TeamMemberByTeamIdPageQuery;

/**
 * TeamMemberMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMemberDO> {

    /**
      * 查询团队下的成员信息
      */
    List<TeamMemberDO> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}
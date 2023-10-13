package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;

/**
 * TeamMemberMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMemberDO> {

    /**
     * 分页查询团队成员
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<TeamMemberDO> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}
package com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamMemberDO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberByTeamIdPageQuery;

/**
 * TeamMemberMapper接口
 *
 * @author visual-ddd
 * @since 1.0
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
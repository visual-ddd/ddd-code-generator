package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.client.organization.query.TeamPageQuery;

/**
 * TeamMapper接口
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {

    /**
     * 查询团队详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    TeamDO teamQuery(TeamQuery query);

    /**
     * 分页查询团队
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<TeamDO> teamPageQuery(TeamPageQuery pageQuery);

}
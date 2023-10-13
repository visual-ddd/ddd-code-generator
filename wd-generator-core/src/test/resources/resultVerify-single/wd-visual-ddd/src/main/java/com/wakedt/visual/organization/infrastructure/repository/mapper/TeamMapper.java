package com.wakedt.visual.organization.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.organization.client.query.TeamQuery;
import com.wakedt.visual.organization.client.query.TeamPageQuery;

/**
 * TeamMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {

    /**
      * 团队详情查询对象
      */
    TeamDO teamQuery(TeamQuery query);

    /**
      * 团队分页查询对象
      */
    List<TeamDO> teamPageQuery(TeamPageQuery pageQuery);

}
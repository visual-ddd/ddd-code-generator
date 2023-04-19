package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.client.organization.query.TeamPageQuery;

/**
 * TeamMapper接口
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {

    /** 查询团队详情 */
    TeamDO teamQuery(TeamQuery query);

    /** 分页查询团队 */
    List<TeamDO> teamPageQuery(TeamPageQuery pageQuery);

}
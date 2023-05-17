package com.wakedt.visual.infrastructure.organization.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.organization.query.TeamPageQuery;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TeamMapper接口
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {

    /** 团队详情查询对象 */
    TeamDO teamQuery(TeamQuery query);

    /** 团队分页查询对象 */
    List<TeamDO> teamPageQuery(TeamPageQuery pageQuery);

}
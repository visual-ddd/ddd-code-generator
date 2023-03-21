package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;
import com.wakedt.visual.client.organization.query.OrganizationInfoByAccountIdQuery;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.client.organization.query.TeamPageQuery;
import com.wakedt.visual.client.organization.query.TeamInfoByAccountIdQuery;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;

/**
 * TeamMapper接口
 */
@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {

    /** 查询组织详情 */
    TeamDO organizationQuery(OrganizationQuery query);

    /** 根据用户查询关联的组织信息列表 */
    TeamDO organizationInfoByAccountIdQuery(OrganizationInfoByAccountIdQuery query);

    /** 查询团队详情 */
    TeamDO teamQuery(TeamQuery query);

    /** 根据账号查询所属团队信息列表 */
    TeamDO teamInfoByAccountIdQuery(TeamInfoByAccountIdQuery query);

    /** 分页查询组织 */
    List<TeamDO> organizationPageQuery(OrganizationPageQuery pageQuery);

    /** 分页查询团队 */
    List<TeamDO> teamPageQuery(TeamPageQuery pageQuery);

    /** 分页查询团队成员 */
    List<TeamDO> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);
}
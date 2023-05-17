package com.wakedt.visual.infrastructure.organization.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * OrganizationMapper接口
 */
@Mapper
public interface OrganizationMapper extends BaseMapper<OrganizationDO> {

    /** 组织详情查询对象 */
    OrganizationDO organizationQuery(OrganizationQuery query);

    /** 组织分页查询对象 */
    List<OrganizationDO> organizationPageQuery(OrganizationPageQuery pageQuery);

}
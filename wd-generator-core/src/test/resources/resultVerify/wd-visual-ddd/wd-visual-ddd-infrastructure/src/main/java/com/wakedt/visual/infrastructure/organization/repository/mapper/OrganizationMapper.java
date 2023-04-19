package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;

/**
 * OrganizationMapper接口
 */
@Mapper
public interface OrganizationMapper extends BaseMapper<OrganizationDO> {

    /** 查询组织详情 */
    OrganizationDO organizationQuery(OrganizationQuery query);

    /** 分页查询组织 */
    List<OrganizationDO> organizationPageQuery(OrganizationPageQuery pageQuery);

}
package com.wakedt.visual.infrastructure.organization.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
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

    /** 组织详情查询对象 */
    OrganizationDO organizationQuery(OrganizationQuery query);

    /** 组织分页查询对象 */
    List<OrganizationDO> organizationPageQuery(OrganizationPageQuery pageQuery);

}
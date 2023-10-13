package com.wakedt.visual.organization.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.organization.client.query.OrganizationQuery;
import com.wakedt.visual.organization.client.query.OrganizationPageQuery;

/**
 * OrganizationMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Mapper
public interface OrganizationMapper extends BaseMapper<OrganizationDO> {

    /**
      * 组织详情查询对象
      */
    OrganizationDO organizationQuery(OrganizationQuery query);

    /**
      * 组织分页查询对象
      */
    List<OrganizationDO> organizationPageQuery(OrganizationPageQuery pageQuery);

}
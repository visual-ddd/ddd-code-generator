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
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface OrganizationMapper extends BaseMapper<OrganizationDO> {

    /**
     * 查询组织详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    OrganizationDO organizationQuery(OrganizationQuery query);

    /**
     * 分页查询组织
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<OrganizationDO> organizationPageQuery(OrganizationPageQuery pageQuery);

}
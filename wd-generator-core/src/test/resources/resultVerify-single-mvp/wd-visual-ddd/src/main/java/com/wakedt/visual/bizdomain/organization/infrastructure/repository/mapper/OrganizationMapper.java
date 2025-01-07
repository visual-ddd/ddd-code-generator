package com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationQuery;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationPageQuery;

/**
 * OrganizationMapper接口
 *
 * @author visual-ddd
 * @since 1.0
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
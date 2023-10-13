package com.wakedt.visual.infrastructure.application.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.client.application.query.ApplicationPageQuery;
import com.wakedt.visual.client.application.query.ApplicationListQuery;

/**
 * ApplicationMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface ApplicationMapper extends BaseMapper<ApplicationDO> {

    /**
     * 查询应用详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ApplicationDO applicationQuery(ApplicationQuery query);

    /**
     * 分页查询应用
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<ApplicationDO> applicationPageQuery(ApplicationPageQuery pageQuery);

    /**
     * 应用列表查询对象
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<ApplicationDO> applicationListQuery(ApplicationListQuery pageQuery);

}
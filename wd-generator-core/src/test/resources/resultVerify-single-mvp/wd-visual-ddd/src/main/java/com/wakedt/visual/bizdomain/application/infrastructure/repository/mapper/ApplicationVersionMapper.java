package com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationLatestVersionQuery;

/**
 * ApplicationVersionMapper接口
 *
 * @author visual-ddd
 * @since 1.0
 */
@Mapper
public interface ApplicationVersionMapper extends BaseMapper<ApplicationVersionDO> {

    /**
     * 查询应用版本详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ApplicationVersionDO applicationVersionQuery(ApplicationVersionQuery query);

    /**
     * 分页查询应用版本
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<ApplicationVersionDO> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery);

    /**
     * 查询应用下的最新版本
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ApplicationVersionDO applicationLatestVersionQuery(ApplicationLatestVersionQuery query);

}
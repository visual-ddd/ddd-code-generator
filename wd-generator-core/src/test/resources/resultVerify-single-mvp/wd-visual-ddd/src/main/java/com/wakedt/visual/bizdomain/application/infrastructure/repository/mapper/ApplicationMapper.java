package com.wakedt.visual.bizdomain.application.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationDO;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationPageQuery;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationListQuery;

/**
 * ApplicationMapper接口
 *
 * @author visual-ddd
 * @since 1.0
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
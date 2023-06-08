package com.wakedt.visual.infrastructure.application.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import com.wakedt.visual.client.application.query.ApplicationVersionQuery;
import com.wakedt.visual.client.application.query.ApplicationVersionPageQuery;
import com.wakedt.visual.client.application.query.ApplicationLatestVersionQuery;

/**
 * ApplicationVersionMapper接口
 */
@Mapper
public interface ApplicationVersionMapper extends BaseMapper<ApplicationVersionDO> {

    /** 应用版本详情查询对象 */
    ApplicationVersionDO applicationVersionQuery(ApplicationVersionQuery query);

    /** 应用版本分页查询对象 */
    List<ApplicationVersionDO> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery);

    /** 应用最新版本查询对象 */
    ApplicationVersionDO applicationLatestVersionQuery(ApplicationLatestVersionQuery query);

}
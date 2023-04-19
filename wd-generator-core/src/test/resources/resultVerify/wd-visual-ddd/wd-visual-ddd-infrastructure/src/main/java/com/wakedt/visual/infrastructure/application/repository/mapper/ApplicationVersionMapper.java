package com.wakedt.visual.infrastructure.application.repository.mapper;

import java.util.*;
import java.math.*;
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

    /** 查询应用版本详情 */
    ApplicationVersionDO applicationVersionQuery(ApplicationVersionQuery query);

    /** 分页查询应用版本 */
    List<ApplicationVersionDO> applicationVersionPageQuery(ApplicationVersionPageQuery pageQuery);

    /** 查询应用下的最新版本 */
    ApplicationVersionDO applicationLatestVersionQuery(ApplicationLatestVersionQuery query);

}
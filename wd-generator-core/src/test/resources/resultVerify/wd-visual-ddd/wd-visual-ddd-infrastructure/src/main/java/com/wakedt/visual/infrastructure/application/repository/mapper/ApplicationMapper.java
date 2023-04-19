package com.wakedt.visual.infrastructure.application.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.client.application.query.ApplicationPageQuery;
import com.wakedt.visual.client.application.query.ApplicationListQuery;

/**
 * ApplicationMapper接口
 */
@Mapper
public interface ApplicationMapper extends BaseMapper<ApplicationDO> {

    /** 查询应用详情 */
    ApplicationDO applicationQuery(ApplicationQuery query);

    /** 分页查询应用 */
    List<ApplicationDO> applicationPageQuery(ApplicationPageQuery pageQuery);

    /** 应用列表查询对象 */
    ApplicationDO applicationListQuery(ApplicationListQuery query);

}
package com.wakedt.visual.application.infrastructure.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.application.client.query.ApplicationListQuery;
import com.wakedt.visual.application.client.query.ApplicationPageQuery;
import com.wakedt.visual.application.client.query.ApplicationQuery;
import com.wakedt.visual.application.infrastructure.repository.model.ApplicationDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ApplicationMapper接口
 */
@Mapper
public interface ApplicationMapper extends BaseMapper<ApplicationDO> {

    /** 应用详情查询对象 */
    ApplicationDO applicationQuery(ApplicationQuery query);

    /** 应用分页查询对象 */
    List<ApplicationDO> applicationPageQuery(ApplicationPageQuery pageQuery);

    /** 应用列表查询对象 */
    List<ApplicationDO> applicationListQuery(ApplicationListQuery pageQuery);

}
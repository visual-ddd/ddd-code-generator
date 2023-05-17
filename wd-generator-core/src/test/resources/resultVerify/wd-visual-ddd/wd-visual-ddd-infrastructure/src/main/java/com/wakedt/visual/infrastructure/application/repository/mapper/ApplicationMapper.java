package com.wakedt.visual.infrastructure.application.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.application.query.ApplicationListQuery;
import com.wakedt.visual.client.application.query.ApplicationPageQuery;
import com.wakedt.visual.client.application.query.ApplicationQuery;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
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
package com.wakedt.visual.businessscene.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneDO;
import com.wakedt.visual.businessscene.client.query.BusinessSceneQuery;
import com.wakedt.visual.businessscene.client.query.BusinessScenePageQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneListQuery;

/**
 * BusinessSceneMapper接口
 */
@Mapper
public interface BusinessSceneMapper extends BaseMapper<BusinessSceneDO> {

    /** 业务场景详情查询对象 */
    BusinessSceneDO businessSceneQuery(BusinessSceneQuery query);

    /** 业务场景分页查询对象 */
    List<BusinessSceneDO> businessScenePageQuery(BusinessScenePageQuery pageQuery);

    /** 业务场景列表查询对象 */
    List<BusinessSceneDO> businessSceneListQuery(BusinessSceneListQuery pageQuery);

}
package com.wakedt.visual.infrastructure.businessscene.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.client.businessscene.query.BusinessScenePageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;

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
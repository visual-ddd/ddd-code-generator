package com.wakedt.visual.infrastructure.businessscene.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;
import com.wakedt.visual.client.businessscene.query.BusinessScenePageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
package com.wakedt.visual.infrastructure.businessscene.repository.mapper;

import java.util.List;
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

    /** 查询业务场景详情 */
    BusinessSceneDO businessSceneQuery(BusinessSceneQuery query);

    /** 分页查询业务场景 */
    List<BusinessSceneDO> businessScenePageQuery(BusinessScenePageQuery pageQuery);

    /** 业务场景列表查询对象 */
    BusinessSceneDO businessSceneListQuery(BusinessSceneListQuery query);

}
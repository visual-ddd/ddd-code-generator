package com.wakedt.visual.infrastructure.businessscene.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneQuery;
import com.wakedt.visual.client.businessscene.query.BusinessScenePageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneListQuery;

/**
 * BusinessSceneMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface BusinessSceneMapper extends BaseMapper<BusinessSceneDO> {

    /**
     * 查询业务场景详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    BusinessSceneDO businessSceneQuery(BusinessSceneQuery query);

    /**
     * 分页查询业务场景
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<BusinessSceneDO> businessScenePageQuery(BusinessScenePageQuery pageQuery);

    /**
     * 业务场景列表查询对象
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<BusinessSceneDO> businessSceneListQuery(BusinessSceneListQuery pageQuery);

}
package com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPageQuery;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneLatestVersionQuery;

/**
 * BusinessSceneVersionMapper接口
 *
 * @author visual-ddd
 * @since 1.0
 */
@Mapper
public interface BusinessSceneVersionMapper extends BaseMapper<BusinessSceneVersionDO> {

    /**
     * 查询业务场景版本详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    BusinessSceneVersionDO businessSceneVersionQuery(BusinessSceneVersionQuery query);

    /**
     * 分页查询业务场景版本
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<BusinessSceneVersionDO> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery);

    /**
     * 查询应用下的最新版本
     *
     * @param query 查询参数
     * @return 查询结果
     */
    BusinessSceneVersionDO businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query);

}
package com.wakedt.visual.businessscene.infrastructure.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.businessscene.client.query.BusinessSceneLatestVersionQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionQuery;
import com.wakedt.visual.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * BusinessSceneVersionMapper接口
 */
@Mapper
public interface BusinessSceneVersionMapper extends BaseMapper<BusinessSceneVersionDO> {

    /** 业务场景版本详情查询对象 */
    BusinessSceneVersionDO businessSceneVersionQuery(BusinessSceneVersionQuery query);

    /** 业务场景版本分页查询对象 */
    List<BusinessSceneVersionDO> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery);

    /** 应用最新版本查询对象 */
    BusinessSceneVersionDO businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query);

}
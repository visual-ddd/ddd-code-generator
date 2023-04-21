package com.wakedt.visual.infrastructure.businessscene.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPageQuery;
import com.wakedt.visual.client.businessscene.query.BusinessSceneLatestVersionQuery;

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
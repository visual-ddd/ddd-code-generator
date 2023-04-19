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

    /** 查询业务场景版本详情 */
    BusinessSceneVersionDO businessSceneVersionQuery(BusinessSceneVersionQuery query);

    /** 分页查询业务场景版本 */
    List<BusinessSceneVersionDO> businessSceneVersionPageQuery(BusinessSceneVersionPageQuery pageQuery);

    /** 查询应用下的最新版本 */
    BusinessSceneVersionDO businessSceneLatestVersionQuery(BusinessSceneLatestVersionQuery query);

}
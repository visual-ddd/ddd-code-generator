package com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPageQuery;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignLatestVersionQuery;

/**
 * DomainDesignVersionMapper接口
 *
 * @author visual-ddd
 * @since 1.0
 */
@Mapper
public interface DomainDesignVersionMapper extends BaseMapper<DomainDesignVersionDO> {

    /**
     * 查询业务域版本详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    DomainDesignVersionDO domainDesignVersionQuery(DomainDesignVersionQuery query);

    /**
     * 分页查询业务域版本
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<DomainDesignVersionDO> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery);

    /**
     * 查询业务域下的最新版本
     *
     * @param query 查询参数
     * @return 查询结果
     */
    DomainDesignVersionDO domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query);

}
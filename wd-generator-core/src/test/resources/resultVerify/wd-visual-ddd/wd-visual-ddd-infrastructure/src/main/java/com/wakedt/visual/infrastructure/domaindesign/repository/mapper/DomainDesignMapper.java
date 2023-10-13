package com.wakedt.visual.infrastructure.domaindesign.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignPageQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignListQuery;

/**
 * DomainDesignMapper接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper
public interface DomainDesignMapper extends BaseMapper<DomainDesignDO> {

    /**
     * 查询业务域详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    DomainDesignDO domainDesignQuery(DomainDesignQuery query);

    /**
     * 分页查询业务域
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<DomainDesignDO> domainDesignPageQuery(DomainDesignPageQuery pageQuery);

    /**
     * 业务域列表查询对象
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果集
     */
    List<DomainDesignDO> domainDesignListQuery(DomainDesignListQuery pageQuery);

}
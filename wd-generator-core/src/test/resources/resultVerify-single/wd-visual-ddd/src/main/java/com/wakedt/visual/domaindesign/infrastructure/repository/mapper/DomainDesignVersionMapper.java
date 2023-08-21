package com.wakedt.visual.domaindesign.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionQuery;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionPageQuery;
import com.wakedt.visual.domaindesign.client.query.DomainDesignLatestVersionQuery;

/**
 * DomainDesignVersionMapper接口
 */
@Mapper
public interface DomainDesignVersionMapper extends BaseMapper<DomainDesignVersionDO> {

    /** 业务域版本详情查询对象 */
    DomainDesignVersionDO domainDesignVersionQuery(DomainDesignVersionQuery query);

    /** 业务域版本分页查询对象 */
    List<DomainDesignVersionDO> domainDesignVersionPageQuery(DomainDesignVersionPageQuery pageQuery);

    /** 业务域最新版本查询对象 */
    DomainDesignVersionDO domainDesignLatestVersionQuery(DomainDesignLatestVersionQuery query);

}
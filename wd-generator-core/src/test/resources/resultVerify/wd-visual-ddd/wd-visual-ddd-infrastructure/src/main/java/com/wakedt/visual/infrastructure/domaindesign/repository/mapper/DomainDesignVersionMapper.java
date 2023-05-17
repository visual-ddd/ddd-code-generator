package com.wakedt.visual.infrastructure.domaindesign.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wakedt.visual.client.domaindesign.query.DomainDesignLatestVersionQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionPageQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionQuery;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
package com.wakedt.visual.infrastructure.domaindesign.repository.mapper;

import java.util.*;
import java.math.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import com.wakedt.visual.client.domaindesign.query.DomainDesignQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignPageQuery;
import com.wakedt.visual.client.domaindesign.query.DomainDesignListQuery;

/**
 * DomainDesignMapper接口
 */
@Mapper
public interface DomainDesignMapper extends BaseMapper<DomainDesignDO> {

    /** 业务域详情查询对象 */
    DomainDesignDO domainDesignQuery(DomainDesignQuery query);

    /** 业务域分页查询对象 */
    List<DomainDesignDO> domainDesignPageQuery(DomainDesignPageQuery pageQuery);

    /** 业务域列表查询对象 */
    List<DomainDesignDO> domainDesignListQuery(DomainDesignListQuery pageQuery);

}
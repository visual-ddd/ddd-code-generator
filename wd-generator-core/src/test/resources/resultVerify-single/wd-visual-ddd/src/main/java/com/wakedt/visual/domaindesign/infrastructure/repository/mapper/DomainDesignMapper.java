package com.wakedt.visual.domaindesign.infrastructure.repository.mapper;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignDO;
import com.wakedt.visual.domaindesign.client.query.DomainDesignQuery;
import com.wakedt.visual.domaindesign.client.query.DomainDesignPageQuery;
import com.wakedt.visual.domaindesign.client.query.DomainDesignListQuery;

/**
 * DomainDesignMapper接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Mapper
public interface DomainDesignMapper extends BaseMapper<DomainDesignDO> {

    /**
      * 业务域详情查询对象
      */
    DomainDesignDO domainDesignQuery(DomainDesignQuery query);

    /**
      * 业务域分页查询对象
      */
    List<DomainDesignDO> domainDesignPageQuery(DomainDesignPageQuery pageQuery);

    /**
      * 业务域列表查询对象
      */
    List<DomainDesignDO> domainDesignListQuery(DomainDesignListQuery pageQuery);

}
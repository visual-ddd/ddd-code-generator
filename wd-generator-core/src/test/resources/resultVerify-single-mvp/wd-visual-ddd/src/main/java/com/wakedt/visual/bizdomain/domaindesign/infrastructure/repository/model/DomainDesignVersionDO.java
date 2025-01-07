package com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域版本实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_domain_design_version")
public class DomainDesignVersionDO extends BaseDO {

    /** 业务域版本ID */
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 业务域ID */
    private Long domainDesignId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

    /** 业务域DSL */
    private String domainDesignDsl;

    /** 图形DSL */
    private String graphDsl;

    /** 版本状态 */
    private Integer versionState;
}
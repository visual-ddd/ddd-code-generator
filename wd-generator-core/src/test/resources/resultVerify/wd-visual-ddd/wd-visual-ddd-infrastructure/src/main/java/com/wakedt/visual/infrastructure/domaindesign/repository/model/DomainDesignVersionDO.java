package com.wakedt.visual.infrastructure.domaindesign.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.*;
import java.math.*;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 描述业务域版本信息实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_domain_design_version")
@Entity
@Table(name = "wd_domain_design_version")
public class DomainDesignVersionDO extends BaseJpaAggregate {

    /** 业务域版本ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 业务域的唯一标识 */
    private Long domainDesignId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;

    /** 业务域抽象文本描述语言 */
    private String domainDesignDsl;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;

    /** 版本状态 */
    private Integer versionState;
}
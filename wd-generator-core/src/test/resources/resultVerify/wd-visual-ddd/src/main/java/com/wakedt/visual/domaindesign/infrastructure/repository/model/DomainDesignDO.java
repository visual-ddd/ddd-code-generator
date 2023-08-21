package com.wakedt.visual.domaindesign.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.domaindesign.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 业务域实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_domain_design")
@Entity
@Table(name = "wd_domain_design")
public class DomainDesignDO extends BaseJpaAggregate {

    /** 业务域 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 名称 */
    private String name;

    /** 团队ID */
    private Long teamId;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;
}
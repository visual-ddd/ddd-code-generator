package com.wakedt.visual.infrastructure.domaindesign.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 维护业务域及版本的领域实体类
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

    /** 团队的唯一标识 */
    private Long teamId;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 描述信息 */
    private String description;
}
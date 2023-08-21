package com.wakedt.visual.organization.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.organization.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 团队实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_organization_team")
@Entity
@Table(name = "wd_organization_team")
public class TeamDO extends BaseJpaAggregate {

    /** 团队ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织ID */
    private Long organizationId;

    /** 团队管理员 */
    private Long teamManagerId;
}
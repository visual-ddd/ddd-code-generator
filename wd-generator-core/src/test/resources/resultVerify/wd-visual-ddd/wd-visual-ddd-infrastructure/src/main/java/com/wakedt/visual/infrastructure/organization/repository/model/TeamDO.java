package com.wakedt.visual.infrastructure.organization.repository.model;

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
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。实体类
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

    /** 组织唯一标识 */
    private Long organizationId;

    /** 团队的管理者，被组织管理员授权，管理自己所在团队 */
    private Long teamManagerId;
}
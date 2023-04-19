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
 * 组织结构管理的领域实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_organization")
@Entity
@Table(name = "wd_organization")
public class OrganizationDO extends BaseJpaAggregate {

    /** 组织 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。 */
    private Long organizationManagerId;
}
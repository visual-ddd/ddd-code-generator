package com.wakedt.visual.infrastructure.application.repository.model;

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
 * 维护应用及版本的领域实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_application")
@Entity
@Table(name = "wd_application")
public class ApplicationDO extends BaseJpaAggregate {

    /** 应用 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 生成项目时的包结构 */
    private String packageName;

    /** 描述信息 */
    private String description;
}
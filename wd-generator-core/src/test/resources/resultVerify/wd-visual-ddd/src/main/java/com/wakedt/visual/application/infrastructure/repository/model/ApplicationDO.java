package com.wakedt.visual.application.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.application.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 应用实体类
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

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;
}
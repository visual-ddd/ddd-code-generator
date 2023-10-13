package com.wakedt.visual.infrastructure.application.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 应用版本实体类
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_application_version")
@Entity
@Table(name = "wd_application_version")
public class ApplicationVersionDO extends BaseJpaAggregate {

    /** 应用版本ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 应用ID */
    private Long applicationId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

    /** 版本状态 */
    private Integer versionState;
}
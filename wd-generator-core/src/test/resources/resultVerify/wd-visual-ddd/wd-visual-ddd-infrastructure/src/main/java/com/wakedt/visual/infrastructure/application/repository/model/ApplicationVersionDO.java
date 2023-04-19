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
 * 描述应用版本信息实体类
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

    /** 应用的唯一标识 */
    private Long applicationId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;

    /** 版本状态 */
    private Integer versionState;
}
package com.wakedt.visual.bizdomain.application.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 应用版本实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_application_version")
@Table(name = "wd_application_version")
@Entity
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
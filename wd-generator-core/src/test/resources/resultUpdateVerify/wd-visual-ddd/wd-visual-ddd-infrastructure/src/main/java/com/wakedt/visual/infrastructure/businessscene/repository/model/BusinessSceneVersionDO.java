package com.wakedt.visual.infrastructure.businessscene.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 业务场景版本实体类
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_business_scene_version")
@Entity
@Table(name = "wd_business_scene_version")
public class BusinessSceneVersionDO extends BaseJpaAggregate {

    /** 业务场景版本ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 业务场景ID */
    private Long businessSceneId;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 业务场景DSL */
    private String businessSceneDsl;

    /** 图形DSL */
    private String graphDsl;

    /** 版本状态 */
    private Integer versionState;
}